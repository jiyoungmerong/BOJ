/*
고려대학교에는 공식 와인이 있다

문제
다음은 고려대학교 포털에 나와 있는 고대 와인에 대한 글 일부이다.

개교 100주년 공식 와인 ‘라 까르돈느(La Cardonne) 2000년’의 뒤를 잇는 우당 박종구 회장 기부 와인 ’나파밸리 2000(Napa Valley 2000)‘,
고대와인 ’클라랑델 루즈2005(Calarendelle Rouge 2005)’, ‘클라랑델 루즈 2009(Clarendelle Rouge 2009)', ‘클라랑델 루즈 2011(Clarendelle Rouge 2011)'을 판매하였으나,
재고량 소진으로 인해 ㈜고대미래 크림슨스토어에서 독점 수입하여 선보이는 ‘라스토 랑데올 2014(Rasteau L’Andeol 2014)’ 와 ‘샤토 클락 2014(Chateau Clarke 2014)’ 로 변경하여 판매합니다.

이 글을 본 수빈이는 고려대학교 와인 콜렉팅이라는 목표를 가지게 되었다. 하지만 그냥 모으면 재미가 없으니 규칙을 가지고 와인을 수집하려고 한다.
와인을 사기로 마음먹은 해를 0년 차라고 정의하고, n년 차에는 Kn+Pn2 만큼의 와인을 사는 것을 목표로 했다.
K는 수빈이의 고려대 애착 정도를 나타내는 상수이고, P는 수빈이의 구매중독 정도를 나타내는 상수이다.
그렇게 수빈이는 C년 동안 열심히 와인을 모았다. (마지막 해에 산 와인의 수는 KC + PC2가 된다.)
수빈이는 와인이 이제 방에 가득 쌓여, 자기가 얼마나 수집했는지 수를 세기 어려웠다.
여러분이 수빈이가 와인을 얼마나 수집했는지 계산해주자.

입력
첫 번째 줄에 수빈이가 와인을 모은 년수, 수빈이의 고려대 애착 정도, 수빈이의 구매중독 정도를 의미하는 정수 C, K, P가 공백으로 구분되어 주어진다. (0 ≤ C ≤ 100, 0 ≤ K ≤ 1000,  0 ≤ P ≤ 100)

출력
첫 번째 줄에 수빈이가 C년 동안 수집한 와인 수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baek_16673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(K*C*(C+1)/2 + P*C*(C+1)*(2*C+1)/6));
        bw.flush();
    }
}
