package JAVA;

import java.util.Scanner;

public class java4999 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String speak = sc.next();
        String listen = sc.next();


        if(speak.length() >= listen.length()){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}