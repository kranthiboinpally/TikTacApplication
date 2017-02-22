package com.game;

import java.util.Scanner;

public class TicTakToeApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        System.out.println("TicTakToe Game is starting");
        System.out.println("Enter PlayerToken");
        
        Scanner sc = new Scanner(System.in);
        char playerToken = sc.next().charAt(0);
        
        System.out.println("Enter Computer Token");
        char oppnentToken = sc.next().charAt(0);
        
        TicTakToe game = new TicTakToe(playerToken, oppnentToken);
        game.printIndexBoard();
        
        AI ai = new AI();
        
        System.out.println("It is your turn, Please Enter Your Spot in the Board");
        
        
        
        
        //Put in while Loop
        int spot = sc.nextInt();
        System.out.println();
        System.out.println("Your spot is: "+spot);
        
        game.pickUserSpot(spot);
        game.printBoard();
        
        
        System.out.println();
        System.out.println("it is my turn now");
        
        int number = ai.pickSpot(game);
        
        //System.out.println("AI random number: "+number);
        game.pickAISpot(number);
        game.printBoard();
        
        

    }

}
