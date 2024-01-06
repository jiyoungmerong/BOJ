/*
2 番目に大きい整数 (The Second Largest Integer)

문제
3 つの整数 A, B, C が与えられる．これらのうち 2 番目に大きい数を出力せよ．

입력
入力は以下の形式で標準入力から与えられる．
A B C

출력
A, B, C のうち，2 番目に大きい数を出力せよ．
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baek_20976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        int secondLargest = Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder()).toList()
                .get(1);
        System.out.println(secondLargest);
    }
}
