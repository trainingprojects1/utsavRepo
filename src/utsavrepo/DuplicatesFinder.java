/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsavrepo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class DuplicatesFinder {
      public static void main(String[] args) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        Function<String, String> duplicate =str->{
            for(int i =0; i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                  map.put(str.charAt(i),1);
                }
                else map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            map.forEach((k,v) ->{if(v!=1){
                stringBuilder.append(k);
            }});
            return stringBuilder.toString();
        };
        String dupCharInStringFormat = duplicate.apply("interface language");
        System.out.println("Duplicate char in string format:"+dupCharInStringFormat);
    }
}
