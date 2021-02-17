/*
Problem_2747_피보나치 수
https://www.acmicpc.net/problem/2747
 */

import java.io.*;

public class No_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Integer[] fibo = new Integer[91];
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