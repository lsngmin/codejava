/*
Problem_11399_ATM
https://www.acmicpc.net/problem/11399
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[Integer.parseInt(br.readLine())];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - i; k++) {
                total += arr[k];
            }
        }
        bw.write(total + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
