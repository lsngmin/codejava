/*
Problem_10250_ACM 호텔
https://www.acmicpc.net/problem/10250
 */

import java.util.Scanner;

public class No_10250 {
    public static void main(String[] args) {
        int T = -1;
        int H, W, N;
        String XX = "", YY = "";
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        while (T > 0) {
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();
            int tmpx = -1;

            if ( N % H == 0 ) {
                tmpx = N / H;
            } else {
                tmpx = (N / H) + 1;
            }

            int tmpy = N % H;
            if (tmpx > W) {
                tmpx = W;
            }
            if (tmpy == 0) {
                tmpy = H;
            }
            XX = String.valueOf(tmpx);
            YY = String.valueOf(tmpy);

            if (tmpx < 10) {
                System.out.println(YY+0+XX);
            } else if (tmpx == 10) {
                System.out.println(YY+XX);
            }
            else {
                System.out.println(YY+XX);
            }
            T--;
        }
    }
}
