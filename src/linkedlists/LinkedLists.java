/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import static java.lang.Character.toLowerCase;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        LinkedList exLinkedList = new LinkedList();
                
        exLinkedList.add("apples");
        exLinkedList.add("bananas");
        exLinkedList.add("carrots");
        exLinkedList.add("Monkey Soup");
        exLinkedList.add("donuts");
        exLinkedList.add("eggs");
        
        exLinkedList.addFirst("sandwich bread");
        
        System.out.println(exLinkedList);
        
        System.out.println("Last item in my list: " + exLinkedList.getLast());
        
        ListIterator iterator = exLinkedList.listIterator(exLinkedList.size());
        
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        */
        
        String input;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("A program to find if an entered\n"
                + "String is a Palindrome.");
        System.out.println("Please enter a String");
        input = userInput.nextLine();
        
        System.out.println("\nEntered string is " + input.length() + " characters long.");
        
        LinkedList isPalindrome = new LinkedList();
        
        for (var i=0; i < input.length(); i++){
            if ( input.charAt(i) != ' ' ){
                isPalindrome.add( toLowerCase( input.charAt(i) ) );
            }
        };
        
        System.out.println(isPalindrome);
        
        LinkedList isPalindromeReversed = new LinkedList();
        
        ListIterator iterator = isPalindrome.listIterator(isPalindrome.size());
        
        while(iterator.hasPrevious()){
            isPalindromeReversed.add(iterator.previous());
        };
        
        System.out.println(isPalindromeReversed);
        
        // compare both linked lists
        
        boolean isPal = false;
               
        for (var i = 0; i < isPalindrome.size(); i++){
            if (isPalindrome.get(i) == isPalindromeReversed.get(i)){
                isPal = true;
            } else {
                isPal = false;
                break;
            }
        }
        
        
        System.out.println("\nPalindrome?: " + isPal);
        
        
    }
    
}
