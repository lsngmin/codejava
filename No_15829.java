/*
Problem_15829_Hashing
https://www.acmicpc.net/problem/15829
 */


import java.io.*;

public class No_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String str = br.readLine();

        final int   M = 1234567891;
        final int   R = 31;

        long  total = 0;
        long      r = 1;

        for (int j = 0; j < str.length(); j++) {
            total = (total + ((str.charAt(j) - 96) * r)) % M;
            r = (r * R) % M;
        }
        System.out.println(total);
    }
}
