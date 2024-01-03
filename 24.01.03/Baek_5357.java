/*
Dedupe

문제
Redundancy in this world is pointless.
Let’s get rid of all redundancy.
For example AAABB is redundant. Why not just use AB?
Given a string, remove all consecutive letters that are the same.

입력
The first line in the data file is an integer that represents the number of data sets to follow.
Each data set is a single string.
The length of the string is less than 100.
Each string only contains uppercase alphabetical letters.

출력
Print the deduped string.
*/

import java.io.*;
import java.util.stream.IntStream;

public class Baek_5357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        IntStream.range(0, num).forEach(i -> {
            try {
                String input = br.readLine();

                String result = input.chars()
                        .mapToObj(c -> (char) c)
                        .reduce("", (s, c) -> s.endsWith(c.toString()) ? s : s + c, (s1, s2) -> s2);

                bw.write(result + "\n");
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        bw.close();
        br.close();
    }
}
