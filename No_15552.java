 /*
 Problem_15552_빠른 A+B
 https://www.acmicpc.net/problem/15552
  */

import java.io.*;
import java.util.StringTokenizer;

 public class No_15552 {
     public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

     public static void main(String[] args) throws IOException {
         int testCase = Integer.parseInt(br.readLine());

         for (int t = 0; t < testCase; t++) {
             StringTokenizer st = new StringTokenizer(br.readLine(), " ");
             bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
         }
         bw.flush();
         bw.close();
         br.close();
     }
 }
