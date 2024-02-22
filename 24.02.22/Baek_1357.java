/*
뒤집힌 덧셈

문제
어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다.
Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자.
예를 들어, X=123일 때, Rev(X) = 321이다.
그리고, X=100일 때, Rev(X) = 1이다.
두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오

입력
첫째 줄에 수 X와 Y가 주어진다. X와 Y는 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 문제의 정답을 출력한다.
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baek_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = new StringBuilder(st.nextToken()).reverse().toString();
        String str2 = new StringBuilder(st.nextToken()).reverse().toString();

        int ch = Integer.parseInt(str1) + Integer.parseInt(str2);
        String answer = new StringBuilder(String.valueOf(ch)).reverse().toString();

        bw.write(String.valueOf(Integer.parseInt(answer)));
        bw.flush();
    }
}
