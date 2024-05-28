package Java;

import java.util.Scanner;

public class java8393 {
    public static void main(String[] args){
        Scanner cal = new Scanner(System.in);

        int n = cal.nextInt(); //반복해서 더해져야 할 숫자 값
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i; //sum = sum+i
        }
        System.out.println(sum);
    }
}
