import java.util.Arrays;
import java.util.Scanner;

public class java3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10]; //10개 수 입력받을 배열
        int n[] = new int[42]; // 42까지 입력 받을 배열
        int count = 0; // 나머지 개수 셀 변수 선언
        int num = 0; //입력 받을 수 선언

        Arrays.fill(n, 0); //배열 0으로 초기화

        for(int i= 0; i < arr.length; i++) { //42로 나눈 나머지 값 n 배열에 넣기
            arr[i] = sc.nextInt();
            num = arr[i] % 42;

            n[num] = num + 1;
        }
        for(int i = 0;i < n.length; i++) {
            if(n[i] != 0) count++; //n배열의 값이 0이 아닌 경우만 1씩 증가
        }
        sc.close();

        System.out.println(count);
    }
}
