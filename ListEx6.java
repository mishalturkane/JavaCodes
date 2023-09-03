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
public class ListEx6{
    public static void main(String[] args) {
        
        List<String> fruit=new ArrayList<>(5);
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter the Fruits:");
            fruit.add(kb.nextLine());
        }
  
        System.out.print("Search the fruit:");
        String fname=kb.nextLine();
        int index=fruit.indexOf(fname);
        if(index==-1){
            System.out.println(":::Fruit Not Found!!!:::");
        }        
        else
           fruit.remove(index);
        
        for(String frt:fruit){
           System.out.print(frt+" ");
       }
        
    }
    
}
