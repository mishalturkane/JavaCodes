package swapdemo;

public class UseNum {
    public static void main(String[] args) {
        Num N1=new Num();
        Num N2=new Num();
        N1.setNum(10,20);
        N2.setNum(5,7);
        System.out.println("Before swapping:");

        N1.showNum();
        N2.showNum();

        Num Temp=new Num();
        Temp.swap(N1,N2);

        System.out.println("after swapping:");
        N1.showNum();
        N2.showNum();
    }
}
