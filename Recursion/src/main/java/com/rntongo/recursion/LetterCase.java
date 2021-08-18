/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rntongo.recursion;
import java.util.*;

/**
 *
 * @author rogersentongo
 */
public class LetterCase {
    
    
    //LetterCase Permutation
    
    static List<String> letterCase(String input)
    {
        //we create the store
        List<String> store = new ArrayList<>();
        //We call the helper method
        lcHelper(input, 0, "", store);
        
        //We return the store
        return store;
        
        
    }
    
    static void lcHelper(String input, int idx, String slate, List<String> store){
        
        //we create our base case
        if(idx == input.length())
        {
            //we have reached the leaf so we add our string
            store.add(slate);
        } else{
            //we get the character for the index
            char curr = input.charAt(idx);
            //Is it a digit
            if(Character.isDigit(curr))
            {
                lcHelper(input, idx+1, slate+curr, store);

            } else{
                //it has two options
                lcHelper(input, idx+1, slate+Character.toLowerCase(curr), store);
                lcHelper(input, idx+1, slate+Character.toUpperCase(curr), store);
                
            }
        }
        
    }
    
    
    public static void main(String[] args) {
        
        List<String> result = letterCase("t1d2");
        
        for(String x: result)
        {
            System.out.println(x);
        }
        
        
        
    }
    
}
