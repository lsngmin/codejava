/*
Problem_10845_큐
https://www.acmicpc.net/problem/10845

자료구조 : Queue
 */

import java.io.*;
import java.util.*;

public class No_10845 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int commandCase = Integer.parseInt(br.readLine());
            
            Queue<Integer> queue = new LinkedList<>();

            int front = 0;

            for (int repeat = 0; repeat < commandCase; repeat++) {
                String command = br.readLine();
                switch (command) {
                    case "front":
                        if (!queue.isEmpty()) {
                            bw.append(queue.peek() + "\n");
                        }
                        else {
                            bw.append("-1\n");
                        }
                        break;
                    case "pop":
                        if (!queue.isEmpty()) {
                            bw.append(queue.poll() + "\n");
                        }
                        else {
                            bw.append("-1\n");
                        }
                        break;
                    case "size":
                        bw.append(queue.size() + "\n");
                        break;
                    case "empty":
                        if (queue.isEmpty()) {
                            bw.append("1\n");
                        }
                        else {
                            bw.append("0\n");
                        }
                        break;
                    case "back"://rear
                        if (!queue.isEmpty()) {
                            bw.append(front + "\n");
                        }
                        else {
                            bw.append("-1\n");
                        }
                        break;
                    default:
                        //"push"문자열을 지우고 숫자만 인수로 넣어준다.
                        int num = Integer.parseInt(command.substring(5));
                                
                        queue.offer(num);
                        front = num;
                }
            }
            bw.flush();
            bw.close();
            br.close();
        }
    }
