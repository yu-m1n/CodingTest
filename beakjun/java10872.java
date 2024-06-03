import java.util.Scanner;

public class java10872 {
    static int fec(int num) {
        if (num <= 1) return 1; //재귀 종료조건
        return num * fec(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = fec(n);

        System.out.println(sum);
    }
}