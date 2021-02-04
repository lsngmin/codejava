/*
Problem_1966_프린터 큐
https://www.acmicpc.net/problem/1966
 */

import java.io.*;
import java.util.*;

public class No_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br   = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw   = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        LinkedList<int[]> ll = new LinkedList<>();

        int testCase = Integer.parseInt(br.readLine());

        for (int test = 0; test < testCase; test++) {
            ll.clear();
            st = new StringTokenizer(br.readLine(), " ");

            int repeat = Integer.parseInt(st.nextToken());
            int   tmp  = Integer.parseInt(st.nextToken());
            int   res  = 0;

            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < repeat; i++) {
                int current = Integer.parseInt(st.nextToken());
                ll.add(new int[]{i, current});
            }

            while (!ll.isEmpty()) {
                int[] check = ll.poll();
                boolean able = true;
                for (int[] k : ll) {
                    if (check[1] < k[1]) {
                        able = false;
                    }
                }
                if (able) {
                    res++;
                    if (check[0] == tmp) {
                        break;
                    }
                }
                else {
                    ll.add(check);
                }
            }
            bw.write(res + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
