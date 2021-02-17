/*
Problem_2309_일곱 난쟁이
https://www.acmicpc.net/problem/2309
 */

import java.io.*;
import java.util.*;

public class No_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        9명 난쟁이 키의 총합에서
        순서없이 뽑은 2명 키의 합을 뺐을 때 100 이면
        그 2명은 거짓말쟁이 이다
         */

        int i, k, total = 0, temp, lier;
        ArrayList<Integer> list = new ArrayList<>();

        for (i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
            total += list.get(i);
        }
        br.close();

        for (i = 0; i < 8; i++) {
            for (k = i + 1; k < 9; k++) {
                temp = list.get(i) + list.get(k);
                if (total - temp == 100) {

                    lier = list.get(k);
                    list.remove(i);
                    list.remove(list.indexOf(lier));

                    Collections.sort(list);

                    for (int j : list) {
                        bw.append(j + "\n");
                    }

                    bw.flush();
                    bw.close();
                    return;
                }
            }
        }
    }
}