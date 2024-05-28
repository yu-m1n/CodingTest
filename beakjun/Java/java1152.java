package Java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class java1152 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s, " "); //공백 기준 토큰(단어) 분리해 st 저장
        System.out.println(st.countTokens()); //토큰 개수 반환
    }
}
