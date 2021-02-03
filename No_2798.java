/*
Problem_2798_블랙잭
https://www.acmicpc.net/problem/2798
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int AMOUNT = Integer.parseInt(st.nextToken());
        final int GOAL = Integer.parseInt(st.nextToken());

        int[] arr = new int[AMOUNT];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(search(arr, AMOUNT, GOAL));
    }
    private static int search(int arr[], int amount, int goal) {
        int result = 0;
        for (int i = 0; i < amount - 2; i++) {
            if(arr[i] >= goal) { continue; }
            for (int j = i + 1; j < amount - 1; j++) {
                if(arr[i] + arr[j] >= goal) { continue; }
                for (int k = j + 1; k < amount; k++) {
                    int tempo = arr[i] + arr[j] + arr[k];
                    if (tempo == goal) {
                        return tempo;
                    }
                    if ((result < tempo) && (tempo < goal)) {
                        result = tempo;
                    }
                }
            }
        }
        return result;
    }
}
