/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertdecimaltobinary;

import java.util.Scanner;

/**
 *
 * @author Kev
 */
public class ConvertDecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); //Scanner to read input from console
         
        System.out.println("Enter a whole number to convert to binary");//prompt user to enter a number
      
        String binaryResult = ""; //String which will hold the result
        
        //TODO Should put some error checking in case  
        
        int number = in.nextInt();//reads integer entered
           
        //Loop until the binary number is found, dividing the starting number by 2 at the end loop
        while(number >= 0){
           
           if(number == 0){
               binaryResult = "0";
               break;   //answer will be zero if zero is entered, exit the loop
           }
                       
                
           if(number == 1){
               binaryResult = "1" + binaryResult;
               break;    // if number entered is 1 the binary result is 1, exit loop
           }             //or if we have reached 1 by dividing by 2 we are done

           int remainder = number % 2; //check if number is divisible by 2

           if(remainder == 0)
                 binaryResult = "0" + binaryResult ; //assign 0 to this position if no remainder
           else
                 binaryResult = "1" + binaryResult;  //assign 1 to this position if there is a remainder(1)

            number = number /2;  //divide by 2 and return to start of loop

         }

        System.out.println("Decimal Value is " +  binaryResult); //display the binary number
       
    }
    
}
