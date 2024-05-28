package Java;

import java.util.*;
public class java2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //Scanner 값을 int로(정수)
        int[] arr = new int[N]; //배열 생성

        for(int i = 0; i < N; i++){ //N으로 입력받은 arr 배열만큼 정수 입력 받음
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            int temp =0; // 상대적인 값 비교를 위한 변수 생성
            for(int j = 0; j < N; j++){
                if(arr[j] > arr[i]){
                    temp = arr[j]; //temp에 arr 첫번째 값을 넣음
                    arr[j] = arr[i]; //arr 첫번째 값과 두 번째 값 비교해 정렬
                    arr[i] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(arr[i]); //오름차순 정렬된 arr 배열 프린트
        }
    }
}


/*public class java2750 {
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
}*/
