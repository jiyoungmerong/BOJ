import java.util.Arrays;
import java.util.Comparator;

class prm_20240224_2 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str_numbers = new String[numbers.length];

        // int 배열인 numbers를 string배열인 str_numbers로 변환
        for (int i = 0 ; i < numbers.length ; i++) {
            str_numbers[i] = String.valueOf(numbers[i]);
        }

        // str_numbers를 Compare()에 정의된 방식으로 정렬
        Arrays.sort(str_numbers, new Compare());

        // 현재 str_numbers는 올림차순으로 정렬되어 있음
        // 따라서 가장 마지막 인덱스의 값이 max값이고, 이것이 반환값의 가장 앞에 올 숫자임
        // 반환값의 맨 앞 숫자가 0이면 answer=0
        // 반환값의 맨 앞 숫자가 0이 아니면 내림차순으로(가장 큰 수부터) answer에 담음
        if (str_numbers[str_numbers.length - 1].equals("0")) {
            answer += "0";
        } else {
            for (int i = str_numbers.length - 1; i >= 0; i--) {
                // Compare 클래스에서 올림차순 정렬을 했다면 아래 코드 사용
                // for(int i = 0 ; i < str_numbers.length ; i++)
                answer += str_numbers[i];
            }
        }
        return answer;
    }
}

class Compare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (o1 + o2).compareTo(o2 + o1); // 올림차순 정렬

        // 내림차순 정렬
        // return (o2 + o1).compareTo(o1 + o2);
    }
}