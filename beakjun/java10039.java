import java.util.Scanner;

public class java10039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] test = new int[4];
        int m = 0;

        for(int i = 0; i < 5; i++){
            test[i] = sc.nextInt(); //sc 숫자로 타입 변형

            if(test[i] <= 40){ //40점부터(<=) 보충학습
                test[i] = 40; //40 이하의 점수인 학생 40으로 맞추기
            }

            m = m + test[i];
            System.out.println(m / 5);
        }
    }
}