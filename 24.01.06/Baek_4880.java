/*
다음수

문제
등차수열(AP)은 인접한 두 수의 차이(공차)가 일정한 수열이다.
예를 들어, 3, 5, 7, 9, 11, 13, ...은 차이가 2로 일정한 등차수열이다.
이 문제에서 등차수열의 공차는 항상 0이 아닌 정수이다.
등비수열(GP)는 각 항이 그 앞과 일정한 비(공비)를 가지는 수열이다.
예를 들어, 2, 6, 18, 54, ...은 공비가 3인 등비수열이다.
이 문제에서 등비수열의 공비는 항상 0이 아닌 정수이다.
어떤 수열의 연속한 세개의 숫자가 주어졌을 때, 이 수열이 등차수열인지 등비수열인지를 알아낸 뒤, 다음 항을 구하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.
각 테스트 케이스는 수열의 연속하는 세 정수 a1, a2, a3이 한 줄에 주어진다.
(-10,000 < a1, a2, a3 < 10,000) a1, a2, a3은 서로 같지 않다.
입력의 마지막 줄에는 0이 세 개 주어진다.

출력
각 테스트 케이스에 대해서, 등차수열이면 AP를, 등비수열이면 GP를 출력한 뒤, 다음 항을 출력한다.
모든 입력은 항상 등차수열이나 등비수열이다.
*/

import java.io.*;

public class Baek_4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while (!(line = br.readLine()).equals("0 0 0")) {
            String[] input = line.split(" ");
            int a1 = Integer.parseInt(input[0]);
            int a2 = Integer.parseInt(input[1]);
            int a3 = Integer.parseInt(input[2]);

            if (a2 - a1 == a3 - a2) {
                sb.append("AP ").append(a3 + (a2 - a1)).append("\n");
            } else {
                sb.append("GP ").append(a3 * (a2 / a1)).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
