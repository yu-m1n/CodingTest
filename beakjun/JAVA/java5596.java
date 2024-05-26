package JAVA;

import java.util.Scanner;

public class java5596 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = 0; // 민국이 총점
        int t = 0; // 만세 총점 각자의 for문 안에서 선언해도 됨

        for(int i = 0; i < 4; i++){
            s += sc.nextInt();
        }
        for(int i = 0; i < 4; i++){
            t += sc.nextInt();
        }

        if(s >= t){
            System.out.println(s);
        } else if (t > s) {
            System.out.println(t);
        }
    }
}
