/*
Problem_1065_한수
https://www.acmicpc.net/problem/1065
 */

import java.io.*;

public class No_1065 {
    private static int num;
    private static int res = 99;

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        bw.write(checkHansu() + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int checkHansu() {
        //1 ~ 109까지 한수는 99개
        if (num < 100) {
            return num;
        }
        int[] ar = new int[3];
        //110부터 체크
        for (int c = 110; c <= num; c++) {
            //1000은 배열 범위 넘어서므로 예외처리
            if (c == 1000) {
                break;
            }
            //i 값을 10으로 나누면 for 문에 문제가 생기므로 tmp 변수 선언
            int tmp = c;
            for (int i = 0; i < 3; i++) {
                ar[i] = tmp % 10;
                tmp /= 10;
            }
            //각 자리 수의 차가 같으면 한수
            if (ar[2] - ar[1] == ar[1] - ar[0]) {
                res++;
            }
        }
        return res;
    }
}