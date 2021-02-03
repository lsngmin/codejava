/*
Problem_5622_다이얼
https://www.acmicpc.net/problem/5622
 */

import java.io.*;

public class No_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] second = new int[]{
               3, 4, 5, 6, 7, 8, 9, 10
        };
        int res = 0;
        // 너무 구시대적인 방법 같다.
        // 근데 떠오르는게 이거말고 없어
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A': case 'B': case 'C':
                    res += second[0];
                    continue;
                case 'D': case 'E': case 'F':
                    res += second[1];
                    continue;
                case 'G': case 'H': case 'I':
                    res += second[2];
                    continue;
                case 'J': case 'K': case 'L':
                    res += second[3];
                    continue;
                case 'M': case 'N': case 'O':
                    res += second[4];
                    continue;
                case 'P': case 'Q': case 'R': case 'S':
                    res += second[5];
                    continue;
                case 'T': case 'U': case 'V':
                    res += second[6];
                    continue;
                case 'W': case 'X': case 'Y': case 'Z':
                    res += second[7];
                    continue;
            }
        }
        bw.write(res + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
