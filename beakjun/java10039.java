import java.util.Scanner;

public class java10039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] test = new int[4];
        int m = 0;

        for(int i = 0; i < 5; i++){
            test[i] = sc.nextInt();

            if(test[i] < 40){
                test[i] = 40;

                m = m+ test[i];
            }
            System.out.println(m / 5);
        }
    }
}