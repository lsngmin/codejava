/*
Problem_1920_수 찾기
https://www.acmicpc.net/problem/1920

자료구조 : Binary Search
 */

import java.io.*;
import java.util.*;

public class No_1920 {
    private static int[] a;
    private static int left;
    private static int right;
    private static int mid;

    private static int binarySearch(int check) {
        while (right >= left) {
            if (check == a[mid]) {
                return 1;
            }
            if (check > a[mid]) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else {
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            left  = 0;
            right = a.length - 1;
            mid   = (left + right) / 2;

            bw.append(binarySearch(Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
