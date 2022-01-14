/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsavrepo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        Function<String, Set<Character>> duplicatesRemoved =str->{
            for(int i =0; i<str.length();i++){
                set.add(str.charAt(i));
            }
            return set;
        };
        Set<Character> removedDuplicatesString = duplicatesRemoved.apply("interface");
        removedDuplicatesString.stream().forEach((ch) -> {
            stringBuilder.append(ch);
        });
        System.out.println("The string after removing duplicates is:"+stringBuilder);
    }
}
