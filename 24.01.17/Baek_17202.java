/*
핸드폰 번호

문제
어린시절 다들 한 번씩은 이름으로 궁합을 본 적이 있을 것이다.
이것과 비슷한 방식으로 중앙대학교에는 핸드폰 번호 궁합을 보는 것이 유행이라고 한다.
핸드폰 번호 궁합을 보기 위해서는 먼저 궁합을 보고싶은 두 중앙대생 A와 B의 핸드폰 번호에서 맨 앞의 010과 "-"(하이픈)을 모두 제외한 후,
A부터 시작하여 한 숫자씩 번갈아가면서 적는다. 그리고 인접한 두 숫자끼리 더한 값의 일의 자리를 두 숫자의 아래에 적어나가면서 마지막에 남는 숫자 2개로 궁합률을 구하게 된다.
예를 들어, 아래의 그림과 같이 A의 번호가 010-7475-9336 이고, B의 번호가 010-3619-5974 이면,
7346715995393764에서 시작하여 070386484822030, 77314022204233, 4045424424656, 449966866011, 83852442612, 1137686873, 240344450, 64378895, 0705674, 775131, 42644, 6808, 488, 26이 되어 둘은 26%의 궁합률을 가지게 된다.

위의 예시에서처럼 인접한 두 숫자를 더한 값이 두자리 정수가 되더라도, 일의 자리 숫자만 적는다.
가령 7과 3을 더하면 0을 적고, 4와 8을 더하면 2를 적는다.
중앙대학교에서 유행인 핸드폰 번호 궁합률을 알아보는 프로그램을 작성해보자.
단, A와 B의 핸드폰 번호는 다르다고 가정한다.

입력
첫 번째 줄에는 궁합을 보고싶은 중앙대생 A의 핸드폰 번호가 주어진다.
두 번째 줄에는 궁합을 보고싶은 상대방 B의 핸드폰 번호가 주어진다.
핸드폰 번호는 맨 앞의 010과 "-"(하이픈)을 제외하여 숫자 8개로 주어진다.
A와 B의 핸드폰 번호는 같지 않다.

출력
A와 B의 핸드폰 번호 궁합률을 두자리 정수로 출력한다.
십의 자리가 0이어도 앞에 0을 붙여 두자리로 출력한다.
*/
import java.io.*;

public class Baek_17202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            answer.append(s1.charAt(i));
            answer.append(s2.charAt(i));
        }

        while (answer.length() > 2) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < answer.length() - 1; i++) {
                int n = (answer.charAt(i) - '0') + (answer.charAt(i + 1) - '0');
                str.append(n % 10);
            }
            answer = str;
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }
}
