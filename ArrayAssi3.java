package mishal;

import java.util.Scanner;

public class ArrayAssi3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 10 int:");
        int [] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=kb.nextInt();
        }
        for(int x: arr){
            System.out.println("The main array is:"+x);
        }
        int [] brr=new int [10];
        for(int i=10;i>0;i--){
            brr[i]=arr[i];
        }
        for(int x:brr){
            System.out.println("In revers order:"+x);
        }
    }
}
