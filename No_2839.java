/*
Problem_2839_설탕 배달
https://www.acmicpc.net/problem/2839
 */
import java.io.*;
import java.util.Arrays;

public class No_2839 {
    final static int THREE = 3;
    final static int  FIVE = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int   num = Integer.parseInt(br.readLine());
        int[] dic = new int[num + 3];

        Arrays.fill(dic, 9999);
        dic[3] = 1; dic[5] = 1;

        for(int i = 6; i <= num; i++) {
            dic[i] = (Math.min(dic[i-3], dic[i-5]) + 1);
        }
        if(dic[num] >= 9999) {
            System.out.println(-1);
        }
        else {
            System.out.println(dic[num]);
        }
        br.close();
    }
}
