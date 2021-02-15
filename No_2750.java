/*
Problem_2750_수 정렬하기
https://www.acmicpc.net/problem/2750
 */

import java.io.*;
import java.util.Arrays;

public class No_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ar = new int[Integer.parseInt(br.readLine())];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            bw.append(ar[i] + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
