import java.util.*;
import java.util.Arrays;
public class java2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //Scanner 값을 int로(정수)
        int[] arr = new int[N]; //배열 생성

        for(int a = 0; a < N; a++){ //arr 배열에 정수 입력 받음
            arr[a] = sc.nextInt();
        }

        Arrays.sort(arr); //arr 배열 오름차순
        for(int a = 0; a < N; a++){
            System.out.println(arr[a]); //오름차순 정렬된 arr 배열 프린트
        }
    }
}