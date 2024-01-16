/*
부분 문자열

문제
문자열 S의 부분 문자열이란, 문자열의 연속된 일부를 의미한다.
예를 들어, "aek", "joo", "ekj"는 "baekjoon"의 부분 문자열이고, "bak", "p", "oone"는 부분 문자열이 아니다.
문자열 S와 P가 주어졌을 때, P가 S의 부분 문자열인지 아닌지 알아보자.

입력
첫째 줄에 문자열 S, 둘째 줄에 문자열 P가 주어진다. 두 문자열은 빈 문자열이 아니며, 길이는 100만을 넘지 않는다.
또, 알파벳 소문자로만 이루어져 있다.

출력
P가 S의 부분 문자열이면 1, 아니면 0을 출력한다.
*/
import java.io.*;

public class Baek_16916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        String pattern = br.readLine();

        System.out.println(isPatternMatched(text, pattern));
    }

    static int isPatternMatched(String text, String pattern) {
        int[] table = constructTable(pattern);
        int textLen = text.length();
        int patternLen = pattern.length();

        int patternIndex = 0;
        for (int i = 0; i < textLen; i++) {
            while (patternIndex > 0 && text.charAt(i) != pattern.charAt(patternIndex)) {
                patternIndex = table[patternIndex - 1];
            }

            if (text.charAt(i) == pattern.charAt(patternIndex)) {
                if (patternIndex == patternLen - 1) {
                    patternIndex = table[patternIndex];
                    return 1;
                } else {
                    patternIndex += 1;
                }
            }
        }

        return 0;
    }

    static int[] constructTable(String pattern) {
        int patternLen = pattern.length();
        int[] table = new int[patternLen];

        int patternIndex = 0;
        for (int i = 1; i < patternLen; i++) {
            while (patternIndex > 0 && pattern.charAt(i) != pattern.charAt(patternIndex)) {
                patternIndex = table[patternIndex - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(patternIndex)) {
                patternIndex += 1;
                table[i] = patternIndex;
            }
        }

        return table;
    }
}
