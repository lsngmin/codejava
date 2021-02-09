/*
Problem_1546_평균
https://www.acmicpc.net/problem/1546
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int   N = Integer.parseInt(br.readLine());
        int[] A = new int[N];//과목 점수
        float K = 0;
        int tmp = 0; int i = 0; int M = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (i = 0; i < N; i++) {//배열에 값 대입
            A[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        M = A[0];

        for (int k = 1; k < N; k++) {
            if (M < A[k]) {
                M = A[k];
                tmp = k;
            }
        }

        for (int j = 0; j < N; j++) {
            K += (float)A[j] / (float)M * 100;
        }

        bw.write(K/N + "");
        bw.flush();
        bw.close();
    }
}
