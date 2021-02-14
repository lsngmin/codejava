/*
Problem_1427_소트인사이드
https://www.acmicpc.net/problem/1427
 */

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class No_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str     = br.readLine();
        Integer[]  arr = new Integer[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = (int)str.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            bw.append(arr[i] + "");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
