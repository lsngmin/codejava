/*
Problem_1085_직사각형에서 탈출
https://www.acmicpc.net/problem/1085
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x, y, w, h;
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        br.close();

        int  rightBoundary = Math.abs(w - x);
        int   leftBoundary = x;
        int    topBoundary = Math.abs(h - y);
        int bottomBoundary = y;

        int min = -1;

        if (rightBoundary >= leftBoundary)
            min = leftBoundary;
        else
            min = rightBoundary;


        if (min >= topBoundary)
            min = topBoundary;

        if(min >= bottomBoundary)
            min = bottomBoundary;

        bw.write(min + "");
        bw.flush();
        bw.close();
    }
}
