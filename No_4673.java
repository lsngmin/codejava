 /*
 Problem_4673_셀프 넘버
 https://www.acmicpc.net/problem/4673
  */

import java.io.*;
import java.util.StringTokenizer;

 public class No_4673 {
     public static void main(String[] args) {
         boolean[] array = new boolean[10001];

         for (int i = 1; i < array.length; i++) {
             int number = i;
             int    sum = number;

             while (number != 0) {
                 sum += (number % 10);
                 number /= 10;
             }
             if (sum < 10001) {
                 array[sum] = true;
             }
         }
         for (int i = 1; i < array.length; i++) {
             if(!array[i]) {
                 System.out.println(i);
             }
         }
     }
 }

