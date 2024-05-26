package JAVA;

import java.util.Scanner;

public class java10807 { //백준 개수 세기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();

        int[] arr = new int[n]; //n 길이 만큼 들어가는 배열 생성

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //배열에 입력한 정수들 넣기
        }
        int b = sc.nextInt();

        for (int j = 0; j < arr.length; j++) { // 배열 길이만큼 반복문 돌리면서 변수 b 와 같은 숫자 찾음. 같을 경우 count 변수 동작
            if (b == arr[j]) {
                count = count + 1; //count++; 동일 문장
            }
        }
        System.out.println(count);
    }
}