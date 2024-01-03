/*
Gnome Sequencing

문제
In the book All Creatures of Mythology, gnomes are kind, bearded creatures,
while goblins tend to be bossy and simple-minded.
The goblins like to harass the gnomes by making them line up in groups of three,
ordered by the length of their beards.
The gnomes, being of different physical heights, vary their arrangements to confuse the goblins.
Therefore, the goblins must actually measure the beards in centimeters to see if everyone is lined up in order.
Your task is to write a program to assist the goblins in determining whether or not the gnomes are lined up properly,
either from shortest to longest beard or from longest to shortest.

입력
The input starts with line containing a single integer N, 0 < N < 30,
which is the number of groups to process.
Following this are N lines, each containing three distinct positive integers less than 100.

출력
There is a title line, then one line per set of beard lengths.
See the sample output for capitalization and punctuation.
*/

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Baek_4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write("Gnomes:\n");

        IntStream.range(0, n).forEach(i -> {
            try {
                int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                bw.write(isOrdered(arr) ? "Ordered\n" : "Unordered\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isOrdered(int[] arr) {
        return (arr[0] < arr[1] && arr[1] < arr[2]) || (arr[0] > arr[1] && arr[1] > arr[2]);
    }
}
