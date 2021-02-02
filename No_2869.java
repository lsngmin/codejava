/*
Problem_2869_달팽이는 올라가고 싶다
https://www.acmicpc.net/problem/2869
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int    day = Integer.parseInt(st.nextToken());//a
        int  night = Integer.parseInt(st.nextToken());//b
        int height = Integer.parseInt(st.nextToken());//v

        int date = (height - night) / (day - night);

        if ((height - night) % (day - night) != 0) {
            date++;
        }
        bw.write(date + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
