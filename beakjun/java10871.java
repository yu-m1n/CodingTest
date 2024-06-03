import java.util.Scanner;

public class java10871 { //백준 X보다 작은 수
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //입력 받은 n값
        int x = sc.nextInt(); //입력 받은 x값

        int arr[] = new int[n]; //

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] < x){
                System.out.print(arr[i] + " "); //공백으로 구분해 출력 ->println X
            }
        }
    }
}
