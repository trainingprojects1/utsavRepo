/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsavrepo;

public class PalindromeChecker {

   // check whether a given string is a palindrome
    public static void main(String[] args) {
      if (isPalindrome("non")==true) System.out.println(" Given string is a palindrome");
      else System.out.println("Given string is not a palindrome");
    }
    public static boolean isPalindrome(String str){
       StringBuffer str1 = new StringBuffer(); // mutable string which is thread safe
       for(int i = str.length()-1 ; i>=0; i--){
           str1.append(str.charAt(i));
       }
      return str.equals(str1.toString());
//       jhkjhhkjjhkjkjh
    }
}
