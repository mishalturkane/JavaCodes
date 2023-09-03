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
public class ListEx4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        List<String> movie=new ArrayList<>(5);
       
  
       for(int i=0;i<5;i++){
            System.out.println("Enter the movie name");
            String name=kb.nextLine();
            name=name.toLowerCase();
           movie.add(name); 
       }
        
        System.out.println("Enter movie to search");
        String s=kb.nextLine();
        s=s.toLowerCase(); 
        int index=movie.indexOf(s);
        if(index==-1){
            System.out.println("Movie is not present in top 5:");
        }
        else
            System.out.println("Movie is present in index:"+(index+1));
    }
    
}
