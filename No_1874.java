/*
Problem_1874_스택 수열
https://www.acmicpc.net/problem/1874

자료구조 : Stack
 */

import java.io.*;
import java.util.Stack;

public class No_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int  to = Integer.parseInt(br.readLine());
        int max = 1;

        for (int from = 0; from < to; from++) {
            // 스택의 원소를 입력받고
            int csn = Integer.parseInt(br.readLine());
            /*
            스택의 최대값보다 입력받은 원소가 큰 경우에
            최대값부터 입력받은 원소까지 스택에 푸시해준다.
             */
            if (csn >= max) {
                for (int i = max; i <= csn; i++) {
                    stack.push(i);
                    sb.append("+\n");
                }
                // 최대값을 입력값 + 1을 대입한다.
                max = csn + 1;
            }
            // 입력받은 원소의 값과 스택의 탑이 같다면 팝한다.
            if (csn == stack.peek()) {
               stack.pop();
               sb.append("-\n");
            }
            // 만약 같지 않다면 모순이므로 종료한다.
            else if (csn != stack.peek()) {
                System.out.print("NO\n");
                return;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}