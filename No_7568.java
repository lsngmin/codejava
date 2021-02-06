/*
Problem_7568_덩치
https://www.acmicpc.net/problem/7568
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_7568 {
    static int[][] group;

    private static int grade(int order) {
        int res = 1;
        for (int i = 0; i < group.length; i++) {
            if (group[order][0] < group[i][0] && group[order][1] < group[i][1]) {
                ++res;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        // 사람 수
        int num = Integer.parseInt(br.readLine());
        group   = new int[num][2];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            group[i][0] = Integer.parseInt(st.nextToken());
            group[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < num; i++) {
            bw.append(grade(i) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
