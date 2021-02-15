/*
Problem_10826_피보나치 수 4
https://www.acmicpc.net/problem/10826
 */

import java.io.*;
import java.math.BigInteger;

public class No_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        BigInteger[] fibo = new BigInteger[10001];

        fibo[0] = BigInteger.valueOf(0);
        fibo[1] = BigInteger.valueOf(1);

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }
        bw.write(fibo[n] + "");

        bw.flush();
        bw.close();
    }
}