/*
Problem_1259_팰린드롬수
https://www.acmicpc.net/problem/1259
 */

import java.io.*;

public class No_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String    str = br.readLine();
        int    length = -1;
        boolean check = false;

        while (true) {
            check = true;
            length = str.length();

            if (str.equals("0"))
                break;

            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length-i-1)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                bw.write("yes\n");
            }
            else {
                bw.write("no\n");
            }

            str = br.readLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
