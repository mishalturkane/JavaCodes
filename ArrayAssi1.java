package mishal;

import java.util.Scanner;

import static java.lang.System.exit;

public class ArrayAssi1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 10 Int:");
        int [] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=kb.nextInt();
        }
        int n;
        System.out.println("Enter a number to check a number present or not:");
       n=kb.nextInt();
       for(int x:arr) {
       if(x==n){
           System.out.println("Number exixst");
           exit(0);

            }
       }
        System.out.println("Number not exist:");
       }

    }
