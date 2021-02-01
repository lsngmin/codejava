/*
Problem_4949_균형잡힌 세상
https://www.acmicpc.net/problem/4949
 */

import java.io.*;
import java.util.*;

public class No_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<Character>();

        while (true) {
            String str = br.readLine();
            //비어있지 않으면 스택 초기화
            if (!stack.empty()) {
                stack.clear();
            }
            //탈출조건
            if (str.equals(".")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ')'|| str.charAt(i) == ']') {
                    if (!stack.empty() && stack.peek() != str.charAt(i)) {
                        stack.push('n');
                        break;
                    }
                    else if (stack.empty()) {
                        stack.push('n');
                        break;
                    }
                }

                if (str.charAt(i) == '(') {
                    stack.push(')');
                }
                else if (str.charAt(i) == '[') {
                    stack.push(']');
                }
                if (!stack.empty() && (stack.peek() == str.charAt(i) || stack.peek() == str.charAt(i))) {
                    stack.pop();
                }
            }
            //비어있으면 균형잡혀있다.
            if (stack.empty()) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
