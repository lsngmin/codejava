/*
Problem_2775_부녀회장이 될테야
https://www.acmicpc.net/problem/2775
 */

import java.util.*;

public class No_2775 {
        public static int resident(int l, int k, int[][] array) {
            int sum = 0;
            for (int i = 1; i <= k; i++) {
                sum += array[l-1][i];
            }
            return sum;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int testCase = sc.nextInt();

            for (int i = 0; i < testCase; i++) {
                int  floor = sc.nextInt() + 1;
                int number = sc.nextInt() + 1;
                int[][] apartment = new int[floor][number];

                for (int j = 1; j < number; j++) {
                    apartment[0][j] = j;
                }//0층 사람들 채워넣기
                for (int l = 1; l < floor; l++) {
                    for (int k = 1; k < number; k++) {
                        apartment[l][k] = resident(l, k, apartment);
                    }
                }
                System.out.println(apartment[floor-1][number-1]);
            }
        }
    }
