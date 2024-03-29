/*
등장하지 않는 문자의 합

문제
알파벳 대문자로 구성되어있는 문자열 S가 주어졌을 때, S에 등장하지 않는 알파벳 대문자의 아스키 코드 값의 합을 구하는 프로그램을 작성하시오.
문자열 S가 “ABCDEFGHIJKLMNOPQRSTUVW” 일 때, S에 등장하지 않는 알파벳 대문자는 X, Y, Z이다.
X의 아스키 코드 값은 88, Y는 89, Z는 90이므로 이 아스키 코드 값의 합은 267이다.
알파벳 대문자의 아스키 코드 값은 다음과 같다.

A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z
65	66	67	68	69	70	71	72	73	74	75	76	77	78	79	80	81	82	83	84	85	86	87	88	89	90

입력
입력은 T개의 테스트 데이터로 구성된다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
각 테스트 데이터는 한 줄로 구성되어 있고, 문자열 S가 주어진다. S는 알파벳 대문자로만 구성되어 있고, 최대 1000글자이다.

출력
각 테스트 데이터에 대해, 입력으로 주어진 문자열 S에 등장하지 않는 알파벳 대문자의 아스키 코드 값의 합을 한 줄에 하나씩 출력한다.
*/
import java.io.*;

public class Baek_3059 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String line = br.readLine();
            boolean[] alpha = new boolean[26];
            for(char c : line.toCharArray()){
                alpha[c - 'A'] = true;
            }
            int ans = 0;
            for(int j = 0; j < alpha.length; j++){
                if(!alpha[j]){
                    ans += (j + 'A');
                }
            }
            bw.write(ans + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
