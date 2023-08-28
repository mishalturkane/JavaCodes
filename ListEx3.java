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
 * @author misha
 */
public class ListEx3 {
    public static void main(String[] args) {
        List <Integer> number=new ArrayList<>();
         Scanner kb=new Scanner(System.in);
         
         for(int i=0;i<5;i++){
              System.out.print("Enter the number:");
              int n=kb.nextInt();
              number.add(n);
         }
         System.out.println("enter number to search:");
         int s=kb.nextInt();
         if(number.contains(s)){
             System.out.println("Number is present:");
         }
         else
             System.out.println("Number is not present");
       
        
    }
 
}
