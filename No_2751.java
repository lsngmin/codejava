 /*
 Problem_2751_수 정렬하기 2
 https://www.acmicpc.net/problem/2751

 자료구조 : Heap Sort (힙 정렬)
  */


import java.io.*;

public class No_2751 {
    // 배열을 전역범위로 할당하는 것은 함수에서도 파라미터없이 배열에 접근할 수 있게 하기 위함
    public static int[] heap;
    public static int length;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        start_HeapSort();
    }

    private static void start_HeapSort() throws IOException {
        // 정렬할 수의 개수
        length = Integer.parseInt(br.readLine());
        // 힙 이진트리 구조를 만들기 위한 배열 생성
        heap = new int[length];
        // 배열에 값 할당
        for (int i = 0; i < length; i++) {
            heap[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        /*
        각 트리마다 최대힙을 만드는 과정
        최대힙을 만들기 위해서  반복해야하는 횟수는 전체에서 2를 나눈 값
        */
        for (int k = length / 2; k >= 0; k--) {
            compare_Value(k, length);
        }
        /*
        최대힙이 된 배열을 가지고 정렬을 시작
        루트 노드에 있는 값을 리프 노드의 값과 바꾼 후  .1
        바뀐 루트 노드를 재귀 함수 방식으로 다시 호출한 후 정렬하여 .2
        최대힙을 다시 만든다.
         */
        for (int j = length - 1; j >= 0; j--) {
            // 1. 루트 노드와 리프 노드 값의 변경
            switch_Value(0, j);
            // 2. 부모 노드와 양 자식 노드의 값을 비교해 정렬
            compare_Value(0, j);
        }

        for (int i : heap) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void compare_Value(int parent, int heapSize) {
        // 부모가 자식노드의 인덱스를 찾기 위한 변수 선언
        int pNode = parent;
        int rNode = (parent * 2) + 2;
        int lNode = (parent * 2) + 1;
        /*
        if문에서 heapSize와 노드의 인덱스 값을 비교하는 이유는
        정렬한 값은 리프노드에 순서대로 고정되어야 하므로 heapSize와 비교
         */
       // 오른쪽 자식 노드가 값이 더 큰 경우, 부모 노드의 인덱스를 오른쪽 자식 노드 인덱스로 바꾼다.
        if (heapSize > rNode && heap[pNode] < heap[rNode]) {
            pNode = rNode;
        }
        // 왼쪽 자식 노드가 값이 더 큰 경우, 부모 노드의 인덱스를 왼쪽 자식 노드 인덱스로 바꾼다.
        if (heapSize > lNode && heap[pNode] < heap[lNode]) {
            pNode = lNode;
        }
        // 부모 노드의 인덱스가 바뀌었다면 부모 노드의 값이 더 작기 때문에 서로 위치를 바꾼다.
        if (pNode != parent) {
            switch_Value(pNode, parent);
            compare_Value(pNode, heapSize);
        }
    }

    private static void switch_Value(int one, int other) {
        int temp = heap[one];
        heap[one] = heap[other];
        heap[other] = temp;
    }
}
