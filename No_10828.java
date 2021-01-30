/*
Problem_10828_스택
https://www.acmicpc.net/problem/10828

자료구조 : Stack
 */

import java.io.*;

public class No_10828 {
    static int top = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCommand = Integer.parseInt(br.readLine());//명령어 개수
        int[]     stack = new int[testCommand];

        for(int repeat = 0; repeat < testCommand; repeat++) {
            String command = br.readLine();

            switch (command) {
                case "top":
                    bw.write(top(stack) + "\n");
                    break;
                case "pop":
                    bw.write(pop(stack) + "\n");
                    break;
                case "size":
                    bw.write(size() + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                default:
                    push(stack, Integer.parseInt(command.substring(5)));
            }
        }
        bw.flush(); bw.close(); br.close();
    }

    private static void push(int[] stack, int value) { 
        stack[++top] = value;
    }

    private static int size() { 
        return top; 
    }

    private static int empty() {
        if (top == 0) { 
            return 1; 
        }
        else {
            return 0;
        }
    }

    private static int top(int[] stack) {
        if(top != 0) {
            return stack[top];
        }
        else {
            return -1;
        }
    }

    private static int pop(int[] stack) {
        if (top == 0) {
            return -1;
        }
        return stack[top--];
    }
}
