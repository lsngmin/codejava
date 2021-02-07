/*
Problem_11866_요세푸스 문제 0
https://www.acmicpc.net/problem/11866

자료구조 : Linked List
 */

import java.io.*;
import java.util.*;

public class No_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.offer(i);
        }

        bw.append("<");

        while (list.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                int re = list.poll();
                list.offer(re);
            }
            bw.append(list.poll() + ", ");
        }
        bw.append(list.poll() + ">");

        bw.flush();
        bw.close();
        br.close();
    }
}
