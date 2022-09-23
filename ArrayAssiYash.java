package mishal;

import java.util.Scanner;

public class ArrayAssiYash {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [] arr=new int [20];
        for(int i=0;i<20;i++)
        arr[i]=kb.nextInt();
        int p=0,n=0,o=0,z=0,e=0;
        for(int i=0;i<20;i++){
            if(arr[i]==0)
                z++;
            else if(arr[i]>0)
                p++;
            else if(arr[i]<0)
                n++;
            else if(arr[i]%2==0)
                e++;
            else
                o++;
        }
        System.out.println("no of zerp"+z);
        System.out.println("no of postitive"+p);
        System.out.println("no of negative"+n);
        System.out.println("no of even"+e);
        System.out.println("no of odd"+o);

    }
}
