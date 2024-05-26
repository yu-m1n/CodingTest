package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1. A(시)와 B(분)을 하나의 분으로 변환, C를 더하고 나온 결과 값을 시, 분 으로 변환
// 2. C를 시와 분으로 변환, 나뉘어진 시와 분을 A, B에 각각 더해 연산
public class java2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int sum = a * 60 + b; //시간 -> 분 변환
        sum = sum + c; // min += c; 와 동일 문장

        int hour = (sum / 60) % 24;
        int min = sum% 60;

        System.out.println(hour + " " + min);
    }
}
