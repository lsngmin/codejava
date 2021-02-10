/*
Problem_2805_나무 자르기
https://www.acmicpc.net/problem/2805
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int  po = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] trees = new int[num];
        for (int i = 0; i < num; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(trees);

        int  right = trees[num - 1];
        int   left = 0;
        int    mid = 0;

        while (left <= right) {
            long total = 0;
            mid = (left+ right) / 2;

            for (int i = 0; i < num; i++) {
                total += trees[i] > mid ? trees[i] - mid : 0;
            }
            if (po > total) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        bw.write(right + "");
        bw.flush();
        bw.close();
    }
}
