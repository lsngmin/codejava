/*
Problem_9012_괄호
https://www.acmicpc.net/problem/9012
 */

import java.io.*;

public class No_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int     testData = Integer.parseInt(br.readLine());
        int   countToken = -1;
        boolean  isCheck = false;

        for(int repeat = 0; repeat < testData; repeat++) {
            String str = br.readLine();
            countToken = 0;

            confirm : for (int i = 0; i < str.length(); i++) {
                if (countToken < 0) {//')'이 먼저 나오거나 판별 중에 VPS가 아니라고 판단되는 경우
                    isCheck = false;
                    break confirm;
                }
                if (str.charAt(i) == '(') {
                    ++countToken;
                }
                else if (str.charAt(i) == ')') {
                    --countToken;
                }
            }
            /*
            countToken이 0이면 VPS이고 0보다 크거나 작으면 VPS가 아니다.
             */
            if (countToken == 0) { isCheck = true; }
            else if (countToken > 0) { isCheck = false; }
            else { isCheck = false; }

            if (isCheck) { bw.write("YES\n"); }
            else { bw.write("NO\n"); }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
