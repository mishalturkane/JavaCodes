/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prati
 */
public class ListEx2 {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Jan");
        li.add("Feb");
        System.out.println("Is Jan is present?"+li.contains("Jan"));
        System.out.println("Is feb is present?"+li.contains("feb"));        
    }
    
}
