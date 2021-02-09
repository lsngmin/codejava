/*
Problem_4153_직각삼각형
https://www.acmicpc.net/problem/4153
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int    max = -1;

        while (true) {
            int[] rect = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 3; i++) {
                rect[i] = Integer.parseInt(st.nextToken());
            }
            if (((rect[0] == 0) && (rect[1] == 0)) && (rect[2] == 0)) { break; }
            max = rect[0] > rect[1] ? (Math.max(rect[0], rect[2])) : (Math.max(rect[1], rect[2]));

            if (max == rect[0]) {
                if (Math.pow(max, 2) == (Math.pow(rect[1], 2) + Math.pow(rect[2], 2))) {
                    System.out.println("right");
                }
                else {
                    System.out.println("wrong");
                }
            }
            else if (max == rect[1]) {
                if (Math.pow(max, 2) == (Math.pow(rect[0], 2) + Math.pow(rect[2], 2))) {
                    System.out.println("right");
                }
                else {
                    System.out.println("wrong");
                }
            }
            else {
                if (Math.pow(max, 2) == (Math.pow(rect[0], 2) + Math.pow(rect[1], 2))) {
                    System.out.println("right");
                }
                else {
                    System.out.println("wrong");
                }
            }
        }
    }
}

