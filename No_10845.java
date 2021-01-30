/*
Problem_10845_큐
https://www.acmicpc.net/problem/10845

자료구조 : Queue
 */

import java.io.*;

public class No_10845 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            //명령어 개수
            int commandCase = Integer.parseInt(br.readLine());
            //큐 생성
            Queue queue = new Queue(null, null);

            for (int repeat = 0; repeat < commandCase; repeat++) {
                String command = br.readLine();

                switch (command) {
                    case "front":
                        bw.write(queue.front() + "\n");
                        break;
                    case "pop":
                        bw.write(queue.pop() + "\n");
                        break;
                    case "size":
                        bw.write(queue.size() + "\n");
                        break;
                    case "empty":
                        bw.write(queue.empty() + "\n");
                        break;
                    case "back":
                        bw.write(queue.rear() + "\n");
                        break;
                    default:
                        //"push"문자열을 지우고 숫자만 인수로 넣어준다.
                        queue.push(Integer.parseInt(command.substring(5)));
                }
            }
            bw.flush();
            bw.close();
            br.close();
        }
    private static class Node {
        //실질적인 값이 들어갈 변수
         private Object value = null;
        //레퍼런스 주소를 저장할 객체
         private Node link;
        //constructor
        Node(Object value, Node link) {
            this.value = value;
            this.link = null;
        }
    }
    private static class Queue {
        //Node 의 정보를 저장할 front 와 rear 생성
        private int size = 0;
        private Node front;
        private Node rear;
        //constructor
        Queue(Node front, Node rear) {
            this.front = front;
            this.rear  = rear;
        }

        private void push(int value) {
            /*
            새로운 노드를 생성.
            노드의 value 에는 push 할 값이 들어있고
            link 에는 null 이 할당되어 있다.
             */
            Node node = new Node(value, null);
            /*
            큐가 비어 있는 경우에는 front 에도 node 를
            연결해주어야 하므로 예외처리를 해주어야 한다.
             */
            if (empty() == 1) {
                front = node;
                rear = node;
            }
            /*
            그렇지 않은 경우에는 rear 가 가리키고 있는
            node->link 에 새로운 노드의 주소를 연결시켜주고
            rear 를 새로운 노드로 바꾼다.
             */
            else {
                rear.link = node;
                rear = node;
            }

            size++;
        }

        private Object pop() {
            //큐가 비어있으면 -1 리턴
            if (empty() == 1) {
                return -1;
            }
            /*
            호출할 노드가 없어도 -1 리턴

            다시말해 front가 null일 경우
            pop이 불가능 하므로 -1 리턴
             */
            if (front == null) {
                return -1;
            }
            /*
            pop 을 할 노드가 있다면
            front 에 front.link 를 연결한 후
            값을 리턴해해준다.
             */
            else {
                Object result = front.value;
                front = front.link;
                size--;
                return result;
            }
        }
        private int size() {
            return size;
        }
        private int empty() {
            /*
            혹시 모르니까
            둘 중에 하나라도 null 값을 가지면 비어있다고 판단
             */
            if (front == null || rear == null) {
                return 1;
            }
            return size == 0 ? 1 : 0;
        }

        private Object rear() {
            if (empty() == 1) {
                return -1;
            }
            else {
                return rear.value;
            }
        }

        private Object front() {
            if (empty() == 1) {
                return -1;
            }
            else {
                return rear.value;
            }
        }
    }
}