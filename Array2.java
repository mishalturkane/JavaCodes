package mishal;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int n;
        int [] arr;
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter size of array:");
        n=kb.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" nos:");
        for(int i=0;i<n;i++)
        {
           arr[i]=kb.nextInt();
        }
        int sum=0;
        int x=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(x+" Value is :"+arr[i]);
            x++;
            sum=sum+arr[i];
        }
        System.out.println("The sum is:"+sum);
        System.out.println("And it's Avarage is:"+(float)sum/n);


    }
}
