 /*
 Problem_2751_수 정렬하기 3
 https://www.acmicpc.net/problem/10989

 자료구조 : Counting Sort (계수 정렬)
  */
import java.io.*;

 public class No_10989 {
     private static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
     private static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

     public static void main(String[] args) throws IOException {
         int num = Integer.parseInt(br.readLine());

         int[] array = new int[num];
         // 배열에 원소 입력
         for (int i = 0; i < num; i++) {
             array[i] = Integer.parseInt(br.readLine());
         }

         int[] counting = new int[10001];
         // 배열에 원소의 개수 입력
         for (int i = 0; i < array.length; i++) {
             counting[array[i]] += 1;
         }
         // 계수 정렬
         for (int i = 1; i < counting.length; i++) {
             counting[i] += counting[i - 1];
         }

         int[] sort = new int[num];
         for (int i = array.length - 1; i >= 0; i--) {
             sort[--counting[array[i]]] = array[i];
         }

         for (int k : sort) {
             bw.append( k + "\n");
         }
         bw.flush();
         bw.close();
         br.close();
     }
 }
