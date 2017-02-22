package com.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//This is ArtificialIntelligence Class, In our case it act like a computer
public class AI {
    
    ArrayList<Integer> choice = new ArrayList<>();
    
    public int pickSpot(TicTakToe game){
        char[] remainingSpot = game.board;
        for(int i=0 ; i<remainingSpot.length ; i++){
            if(remainingSpot[i] == '-'){
                choice.add(i+1);
            }
        }
        
        Random rand = new Random();
        Collections.shuffle(choice);
        return choice.get(0);
            
    }
    
}
