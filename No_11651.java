 /*
 Problem_11651_좌표 정렬하기 2
 https://www.acmicpc.net/problem/11651
  */

 import java.io.*;
 import java.util.*;

 public class No_11651 {
     private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

     private static List<coordinates> list = new ArrayList<>();

     public static void main(String[] args) throws IOException {
         input();

         Collections.sort(list, new Comparator<coordinates>() {
             @Override
             public int compare(coordinates o1, coordinates o2) {
                 if (o1.getY() > o2.getY()) {
                     return 1;
                 } else if (o1.getY() < o2.getY()) {
                     return -1;
                 } else {
                     if (o1.getX() > o2.getX()) {
                         return 1;
                     } else {
                         return -1;
                     }
                 }
             }
         });

         for (coordinates i : list) {
             bw.append(i.getX() + " " + i.getY() + "\n");
         }
         bw.flush();
         bw.close();
     }

     // 좌표 입력 함수
     private static void input() throws IOException {
         int len = Integer.parseInt(br.readLine());
         StringTokenizer st;

         for (int i = 0; i < len; i++) {
             st = new StringTokenizer(br.readLine(), " ");
             list.add(new coordinates(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
         }
         br.close();
     }

     private static class coordinates {
         private int x;
         private int y;

         private coordinates(int x, int y) {
             this.x = x;
             this.y = y;
         }
         public int getX() {
             return x;
         }
         public int getY() {
             return y;
         }
     }
 }