package Java;

import java.util.Scanner;

public class java10039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] test = new int[5]; //배열은 0부터 시작하지 않음..
        int sum = 0; //배열 값 더할 변수 0으로 선언

        for(int i = 0; i < 5; i++){
            test[i] = sc.nextInt(); //scanner로 입력받은 값 정수로

            if(test[i] < 40){ //40점부터(<) 보충학습
                test[i] = 40; //40 이하의 점수인 학생 40으로 맞추기
            }

            sum = sum + test[i];
        }
        System.out.println(sum / 5);
    }
}