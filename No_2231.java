/*
Problem_2231_분해합
https://www.acmicpc.net/problem/2231
 */

import java.io.*;

public class No_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int digit = (int) (Math.log10(number) + 1);

        int ctMax = number;
        int ctMin = ctMax - (digit * 9);

        for (int i = ctMin; i <= ctMax; i++) {
            int decomposeSum = i;
            int repeat = 0;
            int temp = i;

            while (digit != repeat) {
                decomposeSum += temp % 10;
                temp /= 10;
                repeat++;
            }

            if (ctMax == decomposeSum) {
                bw.write(i + "");
                break;
            } else if (i == ctMax) {
                bw.write("0");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
