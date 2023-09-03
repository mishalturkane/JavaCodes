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
public class ListEx5{
    public static void main(String[] args) {
        
        List<String> month=new ArrayList<>(5);
       month.add("Jan");
       month.add("Feb");
       month.add("Mar");
        System.out.println("Before removing");
       for(String m:month){
           System.out.println(m);
       }
        System.out.print("After removing :: ");
        System.out.println( month.remove("Feb"));
       
         for(String m:month){
           System.out.println(m);
       }
        
    }
    
}
