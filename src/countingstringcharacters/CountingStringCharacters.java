/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingstringcharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author christopherbooth
 */
public class CountingStringCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a string to count characters");   
        String countMe = input.nextLine().toUpperCase();
        countCharacters (countMe);   
    }
    
    public static void countCharacters (String countMe)
    {
        char [] chrCountMe = countMe.toCharArray();
        
        Arrays.sort(chrCountMe);
        
        HashMap<Character, Integer> characterInfo = new HashMap<Character, Integer>();
        
        for (char character : chrCountMe)
        {
            if (characterInfo.containsKey(character))
            {
                characterInfo.merge(character, 1, Integer::sum);
            }
            else
            {
                characterInfo.put(character, 1);
            }
        }
        
        System.out.println(characterInfo);
        
        
    }
    
    
    
    
}
