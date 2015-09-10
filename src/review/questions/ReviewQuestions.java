/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review.questions;

import java.util.Scanner;

/**
 *
 * @author mansn0234
 */
public class ReviewQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problem1
        //Creates scanner for system input
        Scanner input = new Scanner(System.in);
        
        //asks for users name
        System.out.println("What is your name?");
        
        //Gets name and stores in variable
        String name = input.nextLine();
        
        //outputs to screen
        System.out.println("Hello, " + name + ".");
        
        int[] myNums = new int[3];
        // i stands for index
        for(int i = 0; i < myNums.length; i++)
        {
            System.out.println("Please enter an int");
            //scan in an integer at spot i
            myNums[i] = input.nextInt();
            
            
        }
        
        System.out.println(myNums[0]);
    }
    
      
}
