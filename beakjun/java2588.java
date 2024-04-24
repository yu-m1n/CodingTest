import java.util.Scanner;
public class java2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        String B = in.next(); //문자열 인덱스 위치의 문자로 뽑아내기 휘함(아스키코드)

        in.close();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));

    }
}
