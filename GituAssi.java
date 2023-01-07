package basic;

import java.util.Scanner;

public class GituAssi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = kb.next();
        String name2 = kb.next();
        System.out.println(name.charAt(0) + "." + name2);
    }
}