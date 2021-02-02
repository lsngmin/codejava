/*
Problem_2292_벌집
https://www.acmicpc.net/problem/2292
 */

import java.io.*;

public class No_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int SIX = 6;

        int number = Integer.parseInt(br.readLine());
        int  range = 1;
        int  count = 1;
        int  tempo = 1;

        while(true) {
            if (range >= number) {
                break;
            }
            range += (SIX * tempo++);
            count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
