/*
Problem_1654_랜선 자르기
https://www.acmicpc.net/problem/1018
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k, n;
        // 1 <= k <= 10,000
        // 1 <= n <= 1,000,000
        int[] lan;
        // 1 <= lan[i] <= 2^31 - 1
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        lan = new int[k];
        for (int i = 0; i < k; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lan);
        br.close();
        long left, mid, right;
        left  = 1;
        right = lan[k - 1];

        long result = 0;
        while (left <= right) {
            long total = 0;
            mid = (left + right) / 2;

            for (int cur = 0; cur < lan.length; cur++) {
                total += lan[cur] / mid;
            }

            if (n > total) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
                result = mid > result ? mid : result;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
