/*
집합

문제
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
all: S를 {1, 2, ..., 20} 으로 바꾼다.
empty: S를 공집합으로 바꾼다.

입력
첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.
둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.

출력
check 연산이 주어질때마다, 결과를 출력한다.
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek_11723 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int S = 0; // 비어있는 공집합

        while (num --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String str = st.nextToken();
            int a;

            switch (str){
                case "add" :
                    a = Integer.parseInt(st.nextToken());
                    S |= (1<<a); // 비트마스크 원소 추가
                    break;

                case "remove":
                    a = Integer.parseInt(st.nextToken());
                    S &= ~(1<<a); // 비트마스크 원소 삭제
                    break;

                case "check":
                    a = Integer.parseInt(st.nextToken());
                    int i = S & (1<<a); // 교집합 찾기
                    bw.write(((i == 0) ? 0 : 1) + "\n");
                    break;

                case "toggle":
                    a = Integer.parseInt(st.nextToken());
                    S ^= (1<<a); // 원소 토글
                    break;

                case "all":
                    S = (1<<21) - 1;
                    break;

                case "empty":
                    S = 0;
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
