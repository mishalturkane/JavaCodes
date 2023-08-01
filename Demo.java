import java.util.Scanner;

public class Demo{

    public static int LinearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
                if(number[i]==key){
                    return i;
                }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner kb=new Scanner(System.in);
       int marks[]={10,20,30,40,50};

      System.out.println("This is a array:");
      for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
      }
      System.out.println();
      System.out.println("Enter a the given value for checking them:");
      int key=kb.nextInt();
       int index=LinearSearch(marks, key);
       System.out.println("The Location of the value is:"+index);
    }
}