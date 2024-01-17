/*
이항 계수

문제
자연수 N과 정수 K가 주어졌을 때 이항 계수 binom{N}{K}를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다.

출력
binom{N}{K}를 출력한다.
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baek_11050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bw.write(Long.toString(combination(N, K)));
        bw.flush();
        bw.close();
    }

    static long factorial(int N) {
        long result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    static long combination(int N, int K) {
        return factorial(N) / (factorial(N - K) * factorial(K));
    }
}
