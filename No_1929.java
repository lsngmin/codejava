/*
Problem_1929_소수 구하기
https://www.acmicpc.net/problem/1929
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] pnq = new boolean[N+1];
        pnq[0] = pnq[1] = false;

        for (int i = 2; i <= N; i++) {
            pnq[i] = true;
        }

        for (int j = 2; j*j <= N ;j++) {
            for (int k = j*j; k <= N; k+=j) {
                pnq[k] = false;
            }
        }
        for (int l = M; l <= N; l++) {
            if (pnq[l]) {
                bw.append(l + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
