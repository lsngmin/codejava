/*
Problem_1157_단어 공부
https://www.acmicpc.net/problem/1157
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String output = output = br.readLine();
        int   count[] = new int[26];
        br.close();

        for (int j = 0; j < output.length(); j++) {
            if ( (65 <= output.charAt(j)) && (output.charAt(j) <= 90)) {//대문자 -> 소문자
                count[output.charAt(j) - 65]++;
            }
            else {
                count[output.charAt(j) - 97]++;
            }
        }

        int M = -1;
        char ch = '?';

        for (int k = 0; k < 26; k++) {
            if (M < count[k]) {
                M = count[k];
                ch = (char)(k + 65);
            }

            else if (M == count[k]) {
                ch = '?';
            }
        }
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
