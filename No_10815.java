/*
Problem_10815_숫자 카드
https://www.acmicpc.net/problem/10815
 */

import java.io.*;
import java.util.*;

public class No_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int i = 0;
        // 소유한 카드 배열 입력 시작
        int[] holdingCard = new int[Integer.parseInt(br.readLine())];
        st = new StringTokenizer(br.readLine(), " ");

        for (i = 0; i < holdingCard.length; i++) {
            holdingCard[i] = Integer.parseInt(st.nextToken());
        }
        // 소유한 카드 배열 입력 끝
        // 체크할 카드 배열 입력 시작
        int[] checkingCard = new int[Integer.parseInt(br.readLine())];
        st = new StringTokenizer(br.readLine(), " ");

        for (i = 0; i < checkingCard.length; i++) {
            checkingCard[i] = Integer.parseInt(st.nextToken());
        }
        // 체크할 카드 배열 입력 끝
        Arrays.sort(holdingCard);
        // 이분탐색 시작 전 값 선언
        boolean isInclude;
        int left, right, mid;
        // 이분 탐색 시작
        for (i = 0; i < checkingCard.length; i++) {
            isInclude = false;
            left  = 0;
            right = holdingCard.length - 1;
            while (left <= right) {
                mid = (left + right) / 2;

                if (holdingCard[mid] == checkingCard[i]) {
                    isInclude = true;
                    break;
                } else if (holdingCard[mid] > checkingCard[i]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (isInclude) {
                bw.append("1 ");
            } else {
                bw.append("0 ");
            }
        }
        // 이분 탐색 끝
        br.close();
        bw.flush();
        bw.close();
    }
}
