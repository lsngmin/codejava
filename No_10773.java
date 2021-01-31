/*
Problem_10773_제로
https://www.acmicpc.net/problem/10773
 */

import java.io.*;

public class No_10773 {

    private static class Stack {
        private static Stack.Node top = null;
        private static int size = 0;

        private static class Node {
            int data = 0;
            Stack.Node next = null;

            Node(int data, Stack.Node next) {
                this.data = data;
                this.next = next;
            }
        }
        private void push(int value) {
            Stack.Node node = new Stack.Node(value, top);
            top = node;
            size++;
        }
        private int pop() {
            if (top == null) {
                return -1;
            }
            int res = top.data;
            top = top.next;
            size--;
            return res;
        }
        private int empty() {
            //스택이 비어있으면 1리턴 아니면 0리턴
            return size == 0 ? 1 : 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack stack = new Stack();

        int repeat = Integer.parseInt(br.readLine());

        for (int current = 0; current < repeat; current++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                int zero = stack.pop();
            }
            else {
                stack.push(num);
            }
        }
        int sum = 0;

        for (int size = 0; stack.empty() == 0; size++) {
            sum += stack.pop();
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
