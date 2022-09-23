package mishal;

import java.util.Scanner;

public class ArrayAssi2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [] arr=new int[20];
        int pos=0;
        int neg=0;
        int odd=0;
        int even=0;
        int zero=0;
        System.out.println("Enter 20 Int:");
        for(int i=0;i<20;i++){
            arr[i]=kb.nextInt();
        }
        for(int x:arr){
            if(x>0){
                pos=pos+1;
            }
            else if(x<0){
                neg=neg+1;
            }
            else if(x%2==0){
                even=even+1;
            }
            else if(x==0){
                zero=zero+1;
            }
            else
                odd++;
        }
        System.out.println("The postitive number is:"+pos);
        System.out.println("The negative number is:"+neg);
        System.out.println("The even number is:"+even);
        System.out.println("The odd number is:"+odd);
        System.out.println("The zero number is:"+zero);
    }
}
