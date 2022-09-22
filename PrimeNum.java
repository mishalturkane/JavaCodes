package mishal;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a no:");
        int a=kb.nextInt();
        int i;

        for(i=2;i<=a-1;i++)
        {
            if(a%i==0)
                break;

        }
        if(a==i)
            System.out.println("Number is prime:");
        else
            System.out.println("No is not prime:");
    }
}
