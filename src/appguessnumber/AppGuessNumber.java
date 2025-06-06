/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appguessnumber;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 344_10
 */
public class AppGuessNumber {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numRandom;
        int numGuess;
        int count = 0;
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        numRandom = r.nextInt(100);
        System.out.println("number is "+numRandom);
        //System.out.println("compari : "+ (numRandom==numGuess));
        
        while (count <= 3){
        System.out.print("Enter you Guess : ");
        numGuess = scan.nextInt();
        if(numGuess==numRandom){
            System.out.println("you win"); 
            break;
        }else if(numGuess>numRandom){
            System.out.println("<<<<< decrement" + (count++));
       
        }else if (numGuess<numRandom){
            System.out.println("Increment >>>>>" + (count++));
        }
         
    
     }if (count >= 3)
        System.out.println("You lose !!");
        
    }
    
}
