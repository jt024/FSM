/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import static java.lang.System.in;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Trevi
 */
public class main {
    static Scanner input = new Scanner(System.in);
    static int currentState = 1;
    
    public static void main(String[] args) throws Exception {
        int count = 0, state =1;
        // Ask user for number of states here
        System.out.println("Please enter the maximum number of states");
        int stateCount = input.nextInt();
        // Ask user for number of characters here
        System.out.println("Please enter the number of different characters");
        int letterCount = input.nextInt();
        // Create rule array      
        int[][] ruleArr = new int[stateCount+1][letterCount+1];

        for (int i = 0; i < 15; i++) {
           System.out.println(); 
        }
        System.out.println("You will need "+ (stateCount*letterCount) + " rules to allow the"
        + " program to check for validity.");
        for (int i = 0; i < 5; i++) {
           System.out.println(); 
        }        
        
        for (int i = 1; i < letterCount+1; i++) {
            for (int j = 1; j < stateCount+1; j++) {
                state = j;
                System.out.println("When I am in state " + state + " and read character "
                        + num2Char(i) +" what state do I jump to?");
                ruleArr[j][i] = input.nextInt();
                System.out.println(i);
                System.out.println(j);
            }
        }
        
        // for debug
        for (int i = 0; i < 5; i++) {
           System.out.println(); 
        }        
        String arr[] = new String[stateCount*letterCount];
        int n = 0;
        for (int i = 0; i < letterCount; i++) {
            for (int j = 0; j < stateCount; j++) {
                arr[n] =  Integer.toString(ruleArr[j][i]);
                n++;
            }
            
        }    
        System.out.print(Arrays.toString(arr));
        for (int i = 0; i < 5; i++) {
           System.out.println(); 
        }
        System.out.println("All Set !!!");
                    char ch;
        int r=0;
        currentState = 1;
        Reader reader = new InputStreamReader(System.in);
        while(true){
            for (int i = 0; i < 5; i++) {
               System.out.println(); 
            }
            System.out.println("Enter your string");
            try{
                while((r = reader.read()) != -1 && currentState != stateCount){
                    ch = (char) r;
                    currentState = ruleArr[currentState][char2Int(ch)];
                    System.out.println(currentState);
//                    state = (currentState);
                    }
            System.out.println("accepted");
            } catch(Exception ex){
                System.out.println("rejected");
            }
            
            
            }
        
        
        

    }
        public static String num2Char(int num){
        String ch = "";
        
        switch(num)
        {
            case 1:
                ch = "\"a\"";
                break;
            case 2:
                ch = "\"b\"";
                break;
            case 3:
                ch = "\"c\"";
                break;
            case 4:
                ch ="\"d\"";
                break;
            case 5:
                ch = "\"e\"";
                break;
            case 6:
                ch = "\"f\"";
                break;
        }
        
        return ch;
        } 
        
        public static int char2Int(char c){
            int num = -1;
            
            switch(c){
                case 'a':
                    num=1;
                    break;
                case 'b':
                    num=2;
                    break;                
                case 'c':
                    num=3;
                    break;
                case 'd':    
                    num=4;
                    break;                
                case 'e':
                    num=5;
                    break;
                case 'f':    
                    num=6;
                    break;
            }
            
            
            return num;
        }
        
}  
        
   
        
//        while(true){
//            if(count==ruleArr.length)
//                break;
//            System.out.println("Enter the letter the next set of rules.");
//            while(true){
//                if(letterCount==letter)
//                    break;
//                System.out.println("Enter rule starting state:");
//                ruleArr[letter][] = input.nextInt();
//                
//                
//                
//            }
//            
//
//            System.out.println("Enter rule character:");
//            chNum = char2Num(input.next());
//            System.out.println(chNum);
//            System.out.println("Enter rule final state:");
            
            


    
    

