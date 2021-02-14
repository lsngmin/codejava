/*
Problem_1181_단어 정렬
https://www.acmicpc.net/problem/1181
 */

import java.io.*;
import java.util.*;

public class No_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> list = new ArrayList<>();

        int    num = Integer.parseInt(br.readLine());
        String str = "";

        for (int i = 0; i < num; i++) {
            str = br.readLine();
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        br.close();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    if (o1.compareTo(o2) < 0){
                        return -1;
                    } else {
                        return 1;
                    }
                }
                else if (o1.length() < o2.length()) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });

        for (String strr : list) {
            bw.append(strr + "\n");
        }
        bw.flush();
        bw.close();
    }
}