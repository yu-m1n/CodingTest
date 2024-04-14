import java.util.Scanner;

public class java11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); //개수
        String a = sc.next(); //입력받은 값

        String[] arr = a. split(""); //공백 없는 숫자 띄워서 배열 저장

        int sum = 0; //계산을 위한 변수 선언

        for(int i = 0; i < num; i++){

            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
