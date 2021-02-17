/*
Problem_1436_영화감독 숌
https://www.acmicpc.net/problem/1436
 */

import java.io.*;

public class No_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 666;

        br.close();
        while (input != count) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        bw.write(num + "");
        bw.flush();
        bw.close();
    }
}