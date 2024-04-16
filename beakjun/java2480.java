import java.util.Scanner;

public class java2480 { //괄호 묶어서 추천
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();    // 첫번째 주사위
        int b = sc.nextInt();    // 두번째 주사위
        int c = sc.nextInt();    // 세번째 주사위

        if(a == b && a == c && a == c) { // 3개 같을 경우 10000 + 같은 눈 x 1000
            System.out.println(10000 + a * 1000);
        }
        else if(a == b && a != c || a == c && a != b) {  // a, b 2개만 같을 경우 1000 + 같은 눈 x 100
            System.out.println(1000 + a * 100);
        }
        else if(b == c && a != a){ // b, c 2개만 같을 경우 1000 + 같은 눈 x 100
            System.out.println(1000 + b * 100);
        }
        else { // 모두 다른 눈이 나오는 경우
            int m = a;  // 가장 큰 눈 x 100

            if (m < b){
                m = b;
            }
            //if (m < sc){
            //    m = c;
            //}
            System.out.println(m * 100);
        }
    }
}
