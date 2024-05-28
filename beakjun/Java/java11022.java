package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //int형 변환
        int a;
        int b;

        StringTokenizer st; //문자열 분리

        for(int i = 1; i < n+1; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println("Case #"+ i + ": " + a + " + " + b + " = "+(a+b));

        }
        br.close();
    }
}
