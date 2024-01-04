/*
IT Passport Examination

문제
การสอบวัดความรู้ระดับพื นฐานด้าน IT หรือ IP (IT Passport Examination) มีข้อสอบ 100 ข้อ ข้อละ 1 คะแนน คิดเป็น 100% ขอบเขตเนื อหามี 3 หมวดได้แก่
Strategy (กลยุทธ์) 35%
Management (การจัดการ IT) 25%
Technology (เทคโนโลยี) 40%
เกณฑ์การสอบผ่าน ผู้เข้าสอบต้องได้คะแนนรวมไม่ตํากว่า 55% และ ต้องได้คะแนนในแต่ละหมวดไม่ตํLากว่า 30% ของคะแนนในหมวดนั น
จงเขียนโปรแกรมประเมินผลการสอบนี 

입력
บรรทัดแรก เป็นจํานวนเต็ม N ระบุจํานวนผู้สอบ และ N บรรทัด ต่อมาเป็นข้อมูลของผู้เข้าสอบแต่ละคน ข้อมูลผู้เข้าสอบแต่ละบรรทัดประกอบด้วย หมายเลขผู้สอบ(ตัวเลข 8 หลัก) แล้วตามด้วยจํานวนเต็ม 3 ค่า ซึLงเป็น คะแนนสอบในหมวดทีL 1, 2 และ 3 ตามลําดับ

출력
แต่ละบรรทัดให้พิมพ์หมายเลขผู้เข้าสอบและ ตามด้วยคะแนนรวม และผลการสอบ (PASS หรือ FAIL) ดัง รูปแบบในตัวอย่าง (ตามลําดับจากอินพุต)
*/

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Baek_11257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        IntStream.range(0, num).forEach(i -> {
            try {
                String[] input = br.readLine().split("\\s+");
                int[] arr = Arrays.stream(Arrays.copyOfRange(input, 1, 4)).mapToInt(Integer::parseInt).toArray();
                int sum = Arrays.stream(arr).sum();

                String result = ((arr[0] < 35 * 0.3 || arr[1] < 25 * 0.3 || arr[2] < 40 * 0.3) || sum < 55) ? "FAIL" : "PASS";
                bw.write(input[0] + " " + sum + " " + result + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bw.flush();
        bw.close();
    }
}
