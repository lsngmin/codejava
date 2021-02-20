/*
Problem_3111_검열
https://www.acmicpc.net/problem/3111
 */

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class No_3111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();//A
        String t = br.readLine();//T

        Stack<Character> front = new Stack<>();
        Stack<Character> back = new Stack<>();
        // 스택 초기값 설정
        /*for (int i = 0; i < t.length(); i++) {
            front.push(t.charAt(i));
            back.push(t.charAt(i));
        }*/
        // 1. T가 A에 없으면 알고리즘 종료
        while (t.contains(a)) {
            // 2. T에서 처음 등장하는 A를 찾은 뒤, 삭제한다.
            for (int i = 0; i < t.length() - 2; i++) {
                if (t.substring(i, i + (a.length())).equals(a)) {
                    for (int j = 0; j < i; j++) {
                        front.push(t.charAt(j));
                    }
                    for (int k = i + (a.length()); k < t.length(); k++) {
                        front.push(t.charAt(k));
                    }
                    break;
                }
            }
            // 3. T에 A가 없으면 알고리즘을 종료한다.
            if (!t.contains(a)) {
                break;
            }
            // 4. T에서 마지막으로 등장하는 A를 찾은 뒤, 삭제한다.
            for (int i = 0; i < a.length();i++) {
                if (a.charAt(i) == front.peek()) {

                }
            }
        }


        while (front.size() != 0) {
            System.out.println(front.pop());
        }
    }
}
