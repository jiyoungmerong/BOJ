/*
덩치

문제
당신은 N개의 반지를 가지고 있다.
각각의 반지는 대문자 10 문자로 이루어진 문자열이 새겨져 있다.
반지는 문자열의 시작과 끝이 연결된 형태로 문자가 새겨져 있다.
반지에 각인된 문자열을 거꾸로 읽는 걱정은 없다.
찾고자하는 문자열이 주어졌을 때 그 문자열을 포함하는 반지가 몇 개인지를 발견하는 프로그램을 작성하라.

입력
입력은 총 2 + N 줄 이다.
첫 번째 줄에는 1 자 이상 10 자 이하의 대문자로 구성된 찾고자 하는 문자열이 적혀있다.
두 번째 줄에는 반지의 개수 N (1 ≦ N ≦ 100)이 적혀있다.
2+i 줄(1 ≦ i ≦ N)엔 i개의 반지에 새겨져있고, 10 문자로 이루어진 문자열이 적혀있다.

출력
찾고자하는 문자열을 포함 반지의 개수를 나타내는 정수를 한 줄로 출력하라.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek_5555 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String output = br.readLine();
            output += output;

            if (output.contains(str)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
