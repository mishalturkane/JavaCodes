package mishal;

import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [][] arr;
        int sum=0;
        System.out.println("Enter Numbers of Rows and Columns :");
        int r=kb.nextInt();
        int c=kb.nextInt();
        arr=new int[r][c];
        int i;
        for( i=0;i<arr.length;i++) {
            System.out.println("Enter number  in row " + (i + 1));
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = kb.nextInt();
                sum = sum + arr[i][j];
            }
        }
            for(i=0;i<arr.length;i++) {
                for(int j=0;j<arr[0].length;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\n\nSum of all number is "+sum+"\navarge is "+((float)sum/(r*c)));
        }
}
