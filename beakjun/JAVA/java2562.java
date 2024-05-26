package JAVA;

import java.util.Scanner;

public class java2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9]; //배열은 1부터 시작
        int max = arr[0]; //최댓값 넣는 변수 ->  기본 선언이 되어있음 0만 해도
        int index = 0; //최댓값 몇 번째인지(위치)

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(max <arr[i]){ //배열 안 수가 최댓값보다 클 경우
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max);       
        System.out.println(index);    
    }
}