/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author stwal
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int wins = 0;
        int losses = 0;
        int ties = 0;
        int intRoundInput = 0;
        int intUserChoice = 4;
       
        System.out.println("How many rounds of rock paper scissors would you like to play? Please enter a value between 1 and 10");
        String roundInput = myScanner.nextLine();
        
        try {
            intRoundInput = Integer.parseInt(roundInput);
        } 
        catch (Exception ex) {
            System.out.println("Sorry, input is invalid.");
            System.out.println(ex);
        }
        
        for (int i = intRoundInput; i > 0; i--) {
           System.out.println("Please make a numerical selection: 1. Rock 2. Paper 3. Scissors");
           String userChoice = myScanner.nextLine();
          
            try {
             intUserChoice = Integer.parseInt(userChoice);
            } 
            catch (Exception ex) {
             System.out.println("Sorry, input is invalid.");
             System.out.println(ex);
            }
            
            int computerChoice = (1 + (int)(Math.random() * ((3 - 1) + 1)));
            
            System.out.println("Round: " + i);
            System.out.println("User: " + intUserChoice);
            System.out.println("Comp: " + computerChoice);
            
            if (intUserChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } 
            if (intUserChoice == 1 && computerChoice == 3) {
                System.out.println("Crushed 'em. You Win!");
                wins++;
            }
            if (intUserChoice == 2 && computerChoice == 1) {
                System.out.println("Smothered. You Win!");
                wins++;
            }
            if (intUserChoice == 3 && computerChoice == 2) {
                System.out.println("Sliced to ribbons. You Win!");
                wins++;
            } 
            
            if (intUserChoice == 1 && computerChoice == 2) {
                System.out.println("Smothered. You lose :(");
                losses++;
            }
            if (intUserChoice == 2 && computerChoice == 3) {
                System.out.println("Snip Snip. You lose!");
                losses++;
            }
            if (intUserChoice == 3 && computerChoice == 1) {
                System.out.println("CRONCH. Loser");
                losses++;
            }
            
        }  
        System.out.println("---------------");
        System.out.println("Game Over!");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("ties: " + ties);
        System.out.println("---------------");
        System.out.println("Play Again? Yes (y) No (n)?");
        
        
    }
}
