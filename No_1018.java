/*
Problem_1018_체스판 다시 칠하기
https://www.acmicpc.net/problem/1018
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1018 {
    private static void paint() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str = "";
        boolean[][] chess_board;
        int i, k, count = 0, row, column, max = 9999999;

        column = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        chess_board = new boolean[column][row];
        /*
        true is like white.
        false is black.

        info.
            66 is ASCII value of 'B'
            87 is ASCII value of 'W'
         */
        for (i = 0; i < chess_board.length; i++) {
            str = br.readLine();
            for (k = 0; k < chess_board[i].length; k++) {
                chess_board[i][k] = str.charAt(k) == 87;
            }
        }

        /*
        if first starting will be black. or
            if first starting will be white.
         */
        for (i = 0; i < column - 7; i++) {// part for column change
            for (k = 0; k < row - 7; k++) {// part for row change
                count = 0;
                boolean first = chess_board[i][k];
                for (int start = i; start < i + 8; start++) {// test
                    for (int j = k; j < k + 8; j++) {
                        if (first != chess_board[start][j]) {
                            count++;
                            //chess_board[start][j] = !first;
                        }
                        first = !first;
                    }
                    first = !first;
                }
                if (max > count) {
                    max = count;
                }
                //reverse
                if (max > 64 - count) {
                    max = 64 - count;
                }

            }
        }

//        for (boolean[] b : chess_board) {
//            System.out.println(Arrays.toString(b));
//        }

        br.close();
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}