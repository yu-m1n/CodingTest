package JAVA;

import java.util.Scanner;

public class java2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //별 입력 값

        for(int i = 1; i <= n ; i++) { //i = 1부터 i = n까지
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i * 2 - 1; j++) { //별이 2 * i = 1개 있음 -> i =1일 때 * 1개, i =2일 때 *이 3개
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i >= 0 ; i--) { //i = n-1부터 i = 1까지
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
