/*
이진수

문제
양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오.
최하위 비트(least significant bit, lsb)의 위치는 0이다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 106)

출력
각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.
*/

import java.io.*;

public class Baek_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            for (int j = 0; n > 0; j++) {
                if (n % 2 == 1) {
                    bw.write(j + " ");
                }
                n /= 2;
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
