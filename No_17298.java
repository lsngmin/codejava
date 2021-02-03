/*
Problem_17298_오큰수
https://www.acmicpc.net/problem/17298
 */

import java.io.*;
import java.util.*;

public class No_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack =  new Stack<>();

        // 수열의 크기를 정해주고
        int to = Integer.parseInt(br.readLine());
        // 값 넣어줄 배열 생성해주고
        int[] input = new int[to];
        // 오큰수를 넣어줄 배열 생성하고
        int[] output = new int[to];
        // 두번째 줄 전부 입력받고
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 배열에 하나씩 넣어보자
        for (int from = 0; from < to; from++) {
            input[from] = Integer.parseInt(st.nextToken());
        }
        /*
        그리고 배열의 마지막에서부터 처음까지 반복하면서
        오큰수를 찾아보자
         */
        for (int i = to - 1; i >= 0; i--) {
            /*
            스택이 비어있지 않고 스택의 탑이 입력값보다 작아질 때까지
            스택을 팝 해보자
             */
            while (!stack.isEmpty() && input[i] >= stack.peek()) {
                stack.pop();
            }
            // 스택이 비어있는 경우에는 오큰수가 없는거니까 -1 넣어주고
            if (stack.isEmpty()) {
                output[i] = -1;
            }
            // 아니면 스택의 탑이 오큰수니까 배열에 넣어주자
            else {
                output[i] = stack.peek();
            }
            // 그리고 스택에 배열값을 계속 넣어준다.
            stack.push(input[i]);
        }

        for (int i : output) {
            bw.append(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
