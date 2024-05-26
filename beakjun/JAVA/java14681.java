package JAVA;

import java.util.Scanner;

public class java14681 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if(X > 0 ){
            if(Y > 0){
                System.out.println(1); //X > 0, Y > 0
            }
            else{
                System.out.println(4); //X > 0, Y < 0
            }
        }
        else{ // X값
            if(Y > 0){
                System.out.println(2); //X < 0, Y > 0
            }
            else{
                System.out.println(3); //X < 0, Y < 0
            }
        }
    }
}
