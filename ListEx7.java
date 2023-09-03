/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author prati
 */
public class ListEx7{
    public static void main(String[] args) {
        
       List<Integer> number=new ArrayList<>();
       Scanner kb=new Scanner(System.in);
       for(int i=0;i<5;i++){
           System.out.println("Enter the role number:");
           number.add(kb.nextInt());
       }
        System.out.println("Enter the roll number to search:");
        int a=kb.nextInt();
        
    }
    
}
