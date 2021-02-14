/*
Problem_2108_통계학
https://www.acmicpc.net/problem/2108
 */

import java.io.*;
import java.util.*;

public class No_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sum = 0, mean;

        // 배열에 원소 입력과 동시에 총합 계산
        int[] arr = new int[Integer.parseInt(br.readLine())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 정렬될 배열 선언
        int[] endSort = new int[arr.length];
        /*
         최빈값 결정하면서 배열의 정렬
         계수 정렬 이용
         */
        int mode = getMode_and_Sort(arr, endSort);

        // 1. 산술평균
        mean = Math.ceil(Math.round(sum / endSort.length));
        bw.append((int)(mean) + "\n");
        // 2. 중앙값
        bw.append(endSort[endSort.length / 2] + "\n");
        // 3. 최빈값
        bw.append(mode + "\n");
        // 4. 범위
        bw.append(endSort[endSort.length - 1] - endSort[0] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getMode_and_Sort(int[] ar, int[] endSort) {
        int i;
        // 원소의 개수를 입력할 배열 생성
        int[] cou = new int[8001];
        /*
        배열의 인덱스 == 인수로 가져온 배열의 원소 이므로
        입력받은 배열에 해당하는 인덱스값에 + 1 해준다

        음수가 포함되어 있으므로 인덱스에 모두 + 4000 해준다.
         */
        for (i = 0; i < ar.length; i++) {
            cou[ar[i] + 4000] += 1;
        }
        // 최빈값 구하기 시작
        int max_Mode = -999999;
        for (i = 0; i < cou.length; i++) {
            if (cou[i] != 0 && cou[i] > max_Mode) {
                max_Mode = cou[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (i = 0; i < cou.length; i++) {
            if (cou[i] == max_Mode) {
                list.add(i - 4000);
            }
        }
        Collections.sort(list);
        // 최빈값 구하기 끝

        // 계수 정렬 시작
        for (i = 1; i < cou.length; i++) {
            cou[i] += cou[i - 1];
        }

        for (i = ar.length - 1; i >= 0; i--) {
            endSort[--cou[ar[i] + 4000]] = ar[i];
        }
        // 계수 정렬 끝
        /*
         최빈값의 리턴 구문
         배열리스트의 크기가 1이면 최빈값이 1이므로 0번째 인덱스 리턴
         1 초과이면 1번째 인덱스 리턴
         */
        if (list.size() == 1) {
            return list.get(0);
        } else {
            return list.get(1);
        }
    }
}