package basic;

import java.util.Scanner;

public class UseFunctions {
    static int a;
    static  int b;
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        functions fnc=new functions();
        System.out.println("Enter 2 int :");

        a=kb.nextInt();
        b=kb.nextInt();
        System.out.println("Select the operation:");
        System.out.println("1.add\n2.sub\n3.multi\n4.div");

        int choice=kb.nextInt();

        switch(choice){
            case 1:
                int sum = fnc.add(a,b);
                System.out.println("The sum is:"+sum);
                break;

            case 2:
                fnc.sub(a,b);
                break;
            case 3:
                int multi=fnc.mul();
                System.out.println("The multiplication is:"+multi);
                break;
            case 4:
                fnc.div();
                break;
            default:
                System.out.println("Please select the correct choice:");
        }



    }
}
