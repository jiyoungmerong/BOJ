/*
배열

문제
정렬되어있는 두 배열 A와 B가 주어진다.
두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다.
배열에 들어있는 수는 절댓값이 109보다 작거나 같은 정수이다.

출력
첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.
*/
import java.io.*;
import java.util.*;

public class Baek_11728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[] = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int result[] = new int[a + b];

        String arrA[] = br.readLine().split(" ");
        String arrB[] = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < a; i++) {
            result[count++] = Integer.parseInt(arrA[i]);
        }

        for (int i = 0; i < b; i++) {
            result[count++] = Integer.parseInt(arrB[i]);
        }

        Arrays.sort(result);

        for(int k:result) {
            bw.write(String.valueOf(k)+" ");
        }

        bw.flush();
        bw.close();
    }

}