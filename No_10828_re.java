/*
Problem_10828_스택
https://www.acmicpc.net/problem/10828

자료구조 : Stack
배열 안쓰고 하기
 */

import java.io.*;

public class No_10828_re {
    private static class Stack {
        private static Node top = null;
        private static int size  = 0;

        private static class Node {
            Object data = null;
            Node   next = null;

            Node(Object data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        private void push(Object value) {
        /*
        LIFO 형식으로 새로운 노드가 이전 노드의 링크의 정보를 가져야 함
        만약 push 를 한번도 안한 상태에서의 예외 처리가 필요
         */
            Node node = new Node(value, top);
            top = node;
            size++;
        }
        private Object pop() {
            //꺼낼 데이터가 없으면 -1 반환
            if (top == null) {
                return -1;
            }
            /*
            노드의 값을 저장한 뒤에
            탑을 탑의 다음 노드로 연결시켜준다.
             */
            Object res = top.data;
            top = top.next;
            size--;
            return res;

        }
        private Object size() {
            return size;
        }

        private Object empty() {
            //스택이 비어있으면 1리턴 아니면 0리턴
            return size == 0 ? 1 : 0;
        }

        private Object top() {
            //조회할 노드가 없으면 -1 리턴
            if (top == null) {
                return -1;
            }
            return top.data;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int commandCase = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for (int repeat = 0; repeat < commandCase; repeat++) {
            String command = br.readLine();

            switch (command) {
                case "top":
                    bw.write(stack.top() + "\n");
                    break;
                case "pop":
                    bw.write(stack.pop() + "\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write(stack.empty() + "\n");
                    break;
                default:
                    //"push"문자열을 지우고 숫자만 인수로 넣어준다.
                    stack.push(Integer.parseInt(command.substring(5)));
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
