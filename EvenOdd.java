package mishal;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int sum=0;
        int choice;
        Scanner kb=new Scanner(System.in);
        System.out.println("select the option ");
        System.out.println("1.even 1 to 100 ");
        System.out.println("2.Odd 1 to 100 ");
        choice=kb.nextInt();
        switch(choice)
        {
            case 1: {
                for (int i =2; i <=100; i=i+2) {
                    System.out.println(i);
                }
                break;

            }
            case 2: {
                for(int i=0;i<=100;i=i+3)
                {
                    System.out.println(i);
                }
                break;

            }

        }
    }
}
