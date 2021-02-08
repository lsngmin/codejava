/*
Problem_1978_소수 찾기
https://www.acmicpc.net/problem/1978
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean isPrime;

        int  count = 0;
        int    one = -1;
        int number = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < number; i++) {
            one = Integer.parseInt(st.nextToken());

            if (one == 1) {
                continue;
            }
            isPrime = true;

            for (int j = 2; j <= Math.sqrt(one); j++) {
                if (one % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
