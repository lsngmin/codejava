/*
Problem_18111_마인크래프트
https://www.acmicpc.net/problem/18111
 */

import java.io.*;
import java.util.StringTokenizer;

public class No_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 가로 세로 블럭의 개수 입력 받기
        int width, depth, blook;
        depth = Integer.parseInt(st.nextToken());//N
        width = Integer.parseInt(st.nextToken());//M
        blook = Integer.parseInt(st.nextToken());//B

        // 땅의 높이의 최소와 최대를 저장하기 위한 변수 선언 과 2차원 배열 선언
        int max = -1, min = 257, temp;
        int[][] ground = new int[depth][width];

        // input
        int i, j, l;// for 문 초기값 미리 선언
        for (i = 0; i < depth; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (j = 0; j < width; j++) {
                temp = Integer.parseInt(st.nextToken());
                ground[i][j] = temp;

                max = max < temp ? temp : max;
                min = min > temp ? temp : min;
            }
        }
        //정답 출력 변수
        int minTime = Integer.MAX_VALUE;
        int height = 0;

        int block, time, standard_height;
        for (i = min; i <= max; i++) {
            standard_height = i;

            time = 0;
            block = blook;

            for (j = 0; j < depth; j++) {
                for (l = 0; l < width; l++) {
                    if (standard_height > ground[j][l]) {
                        temp = standard_height - ground[j][l];
                        block -= temp;
                        time += temp;
                    } else if (standard_height < ground[j][l]) {
                        temp = ground[j][l] - standard_height;
                        block += temp;
                        time += (2 * temp);
                    }
                }
            }
            if (block >= 0) {
                if (minTime > time) {
                    minTime = time;
                    height = standard_height;
                } else if (minTime == time) {
                    height = standard_height;
                }
            }
        }
        bw.write(minTime + " " + height);
        bw.flush();
        bw.close();
        br.close();
    }
}