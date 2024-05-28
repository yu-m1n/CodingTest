package Java;

import java.util.Arrays;
import java.util.Scanner;

public class java10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Scanner 입력 값 바로 n에 저장
        int arr[] = new int[n]; //받은 n으로 배열

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); //배열에 저장된 값 오름차순 정리
        System.out.println(arr[0] + " " + arr[n - 1]); //[0] -> 최솟값, [n-1] -> 최댓값(배열의 가장 마지막에)
    }
}
