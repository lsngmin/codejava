/*
Problem_1018_체스판 다시 칠하기
https://www.acmicpc.net/problem/1018
안풀었어
 */


import java.io.*;
import java.util.StringTokenizer;

public class No_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int r = 1;

        if (k > n / 2) { k = n - k; }

        for (int i = n; i > n - k; i--) { r *= i; }
        for (int i = k; i >= 1; i--) { r /= i; }
        if (k == n || k == 0) {System.out.println(1);}
        else { System.out.println(r); }
    }
}
