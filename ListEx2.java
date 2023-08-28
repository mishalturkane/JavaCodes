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
 * @author misha
 */
public class ListEx2 {
    public static void main(String[] args) {
        List <String> month=new ArrayList <>();
        month.add("jan");
        month.add("feb");
        month.add("mar");
        month.add("apr");
        month.add("may");
        month.add(3,"dec");
        System.out.println(month);
    }
    
   
    
}
