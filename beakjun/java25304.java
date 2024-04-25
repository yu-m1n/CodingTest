import java.util.Scanner;

public class java25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 총 금액
        int n = sc.nextInt(); // 물건 종류 수

        int cal = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt(); // 물건의 가격
            int b = sc.nextInt(); // 물건의 개수

            cal = cal + a * b; // cal += a * b;와 동일 값
        }
        if(x == cal){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
