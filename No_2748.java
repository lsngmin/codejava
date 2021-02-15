/*
Problem_2748_피보나치 수 2
https://www.acmicpc.net/problem/2748
 */

import java.io.*;

public class No_2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] fibo = new long[91];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        bw.write(fibo[n] + "");

        br.close();
        bw.flush();
        bw.close();
    }
}