/*
Problem_10814_나이순 정렬
https://www.acmicpc.net/problem/10814
 */

import java.io.*;
import java.util.*;


public class No_10814 {

    private static class member {
        private int age;
        private int order;
        private String name;

        member() {
        }

        member(int age, String name, int order) {
            this.age = age;
            this.order = order;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public int getOrder() {
            return order;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int amount = Integer.parseInt(br.readLine());

        List<member> list = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list.add(new member(Integer.parseInt(st.nextToken()), st.nextToken(), i));
        }

        Collections.sort(list, new Comparator<member>() {
            @Override
            public int compare(member o1, member o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    if (o1.getOrder() < o2.getOrder()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });

        for (member m : list) {
            bw.append(m.getAge() + " " + m.getName() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
