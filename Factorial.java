package mishal;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a value:");
        n=kb.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is:"+fact);
    }
}
