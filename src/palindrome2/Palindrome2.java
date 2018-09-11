/*
 * Corbin Nash
 * 11/09/2018
 * This a palindrome sentence finder 
 */

package Palindrome2;

import javax.swing.JOptionPane;
 public class Palindrome2 {
    
   public static void main(String[] args) {
     String sentence = JOptionPane.showInputDialog
      ("Words that are arranged the same way forwards as they are backwards are called palindromes"
      + "\n\nEnter a Word");
     
    String sentence2 = sentence.toLowerCase();
    while(sentence2.length()>0){
    int spacePos = sentence.indexOf(" ");
    String word = sentence.substring(0,spacePos);
    String Sentence = sentence.substring(spacePos + 1,sentence.length());
       
  }
 
    
    
    
    
    
 }
}
