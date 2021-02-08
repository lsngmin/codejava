/*
Problem_2164_카드2
https://www.acmicpc.net/problem/2164
 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class No_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        br.close();

        if (n == 1) {
            System.out.print(1);
            return;
        }

        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        do {
            que.poll();
            int tmp = que.poll();
            que.offer(tmp);
        }
        while (que.size() != 1);

        bw.write(que.peek() + "");
        bw.flush();
        bw.close();
    }
}
