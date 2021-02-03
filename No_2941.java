/*
Problem_2941_크로아티아 알파벳
https://www.acmicpc.net/problem/2941
 */

import java.io.*;

public class No_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int coun = 0;

        // 스위치 말고 어떻게 다른거로 해
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'c' :
                    if (i+1 < str.length() && (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
                        i++;
                        coun++;
                    }
                    else {
                        coun++;
                    }
                    break;
                case 'd' :
                    if (i+1 < str.length() && str.charAt(i + 1) == '-') {
                        i++;
                        coun++;
                    }
                    else if (i+2 < str.length() && str.substring(i, i + 3).equals("dz=")) {
                        i += 2;
                        coun++;
                    }
                    else {
                        coun++;
                    }
                    break;
                case 'l' : case 'n' :
                    if (i+1 < str.length() && str.charAt(i + 1) == 'j') {
                        i++;
                        coun++;
                    }
                    else {
                        coun++;
                    }
                    break;
                case 's' : case 'z' :
                    if (i+1 < str.length() && str.charAt(i + 1) == '=') {
                        i++;
                        coun++;
                    }
                    else {
                        coun++;
                    }
                    break;
                default:
                    coun++;
            }
        }
        bw.write(coun + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
