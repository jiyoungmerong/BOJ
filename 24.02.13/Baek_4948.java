/*
베르트랑 공준

문제
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19)
또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
입력의 마지막에는 0이 주어진다.

출력
각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_4948 {

    public static boolean[] arr = new boolean[246913];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        get_decimal();

        while(true) {
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;

            if(num==0)
                break;
            for(int i = num+1; i<=2*num; i++) {
                if(!arr[i])
                    cnt++;
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void get_decimal() { // 소수 구하는 메소드
        arr[0] = arr[1] = true; // 0 과 1 은 소수가 아니므로 true

        for(int i = 2; i <= Math.sqrt(arr.length); i++) {
            if(arr[i])
                continue;
            for(int j = i*i; j<arr.length; j+=i)
                arr[j] = true;
        }
    }

}
