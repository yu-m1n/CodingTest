import java.util.Scanner;

public class java2443 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1 ; i <= n; i++) {
            for(int j = 1; j < i; j++) { // 처음 for문이 1로 시작해서 여기도 1로 시작
                System.out.print(" "); //1씩 늘어남, 0부터 시작
            }
            for(int k = (2 * n)-(i * 2 - 1); k > 0; k--) { //홀수가 나열
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
    }
}
