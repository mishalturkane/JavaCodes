package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prati
 */
public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
       li.add(60);
       li.add(34);
       li.add(90);
   
       Collections.sort(li);
       for(Integer x: li){
           System.out.println(x);
       }
    }
}
