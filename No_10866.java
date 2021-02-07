/*
Problem_10866_덱
https://www.acmicpc.net/problem/10866

자료구조 : Deque
 */

import java.io.*;
import java.util.*;

public class No_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deq = new ArrayDeque<>();

        int commandCase = Integer.parseInt(br.readLine());

        for (int repeat = 0; repeat < commandCase; repeat++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push_front":
                    deq.offerFirst(Integer.parseInt(command[1]));
                    break;
                case "push_back":
                    deq.offerLast(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    if (!deq.isEmpty()) {
                        bw.append(deq.pollFirst() + "\n");
                    } else {
                        bw.append("-1\n");
                    }
                    break;
                case "pop_back":
                    if (!deq.isEmpty()) {
                        bw.append(deq.pollLast() + "\n");
                    } else {
                        bw.append("-1\n");
                    }
                    break;
                case "size":
                    bw.append(deq.size() + "\n");
                    break;
                case "empty":
                    if (!deq.isEmpty()) {
                        bw.append("0\n");
                    } else {
                        bw.append("1\n");
                    }
                    break;
                case "front":
                    if (!deq.isEmpty()) {
                        bw.append(deq.peekFirst() + "\n");
                    } else {
                        bw.append("-1\n");
                    }
                    break;
                case "back":
                    if (!deq.isEmpty()) {
                        bw.append(deq.peekLast() + "\n");
                    } else {
                        bw.append("-1\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
