package junemonth;

import java.util.Scanner;

public class Free {
    public static void main(String[] args) {
        System.out.println("Enter your choice:");
        System.out.print("1.LogIn\n2.SignUp:");
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        switch (n){
            case 1:
                System.out.println("LogIn");
                break;
            case 2:
                System.out.println("SignUp");
                break;
        }
    }
}
