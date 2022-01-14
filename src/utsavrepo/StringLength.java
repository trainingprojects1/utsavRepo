/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsavrepo;

import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<String, Integer> len =a->a.length();
        int lengthOfString = len.apply("Java Learning Functional interface");
        System.out.println("The length of a string is:"+lengthOfString);
    }
        
}
