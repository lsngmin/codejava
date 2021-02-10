/*
Problem_10816_숫자 카드 2
https://www.acmicpc.net/problem/10816
 */

import java.io.*;
import java.util.*;

public class No_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        // 키는 소유한 카드 밸류는 카드의 개수
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // 해쉬맵에 소유한 카드 정보 저장 시작
        int holdingCard_Amount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        int tmp;
        for (int cur = 0; cur < holdingCard_Amount; cur++) {
            tmp = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(tmp)) {
                hashMap.replace(tmp, hashMap.get(tmp) + 1);
            } else {
                hashMap.put(tmp, 1);
            }
        }
        // 해쉬맵에 소유한 카드 정보 저장 끝
        // 소유한 카드와 확인할 카드의 비교 시작
        int CheckingCard_Amount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int cur = 0; cur < CheckingCard_Amount; cur++) {
            tmp = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(tmp)) {
                bw.append(hashMap.get(tmp) + " ");
            } else {
                bw.append("0 ");
            }
        }
        // 소유한 카드와 확인할 카드의 비교 끝
        br.close();
        bw.flush();
        bw.close();
    }
}
