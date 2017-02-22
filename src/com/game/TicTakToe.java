package com.game;

public class TicTakToe {

    protected char[] board;

    protected char userMarker;

    protected char aiMarker;

    protected char winner;

    protected char currentMarker;

    TicTakToe(char playerMaker, char aiMarker) {
        this.userMarker = playerMaker;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
    }

    private char[] setBoard() {
        board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {

        boolean isValid = isWithinRange(spot) && isNotSpottaken(spot);
        if (isValid) {
            board[spot-1] = currentMarker;

            if (currentMarker == userMarker) {
                currentMarker = userMarker;
            } else {
                currentMarker = aiMarker;
            }
        }

        return isValid;
    }
    
    
    public void pickUserSpot(int spot){
        boolean isValid = isWithinRange(spot) && isNotSpottaken(spot);
        if (isValid) {
            board[spot-1] = userMarker;
            currentMarker = userMarker;
       }
    }

    public void pickAISpot(int spot){
        boolean isValid = isWithinRange(spot) && isNotSpottaken(spot);
        if (isValid) {
            board[spot-1] = aiMarker;
            currentMarker = aiMarker;
       }
    }

    
    private boolean isNotSpottaken(int spot) {

        if (board[spot-1] == '-') {
            return true;
        }
        return false;
    }

    private boolean isWithinRange(int spot) {

        if (spot > 0 && spot < board.length)
            return true;

        return false;
    }

    public void printBoard() {

        for (int i = 0; i < board.length; i++) {

            // creating new line for every multiple of 3
            if (i % 3 == 0) {
                System.out.println();
                System.out.println("-------");

            }
            System.out.print(board[i] + "|");
        }

    }

    public void printIndexBoard() {

        for (int i = 0; i < board.length; i++) {

            // creating new line for every multiple of 3
            if (i % 3 == 0) {
                System.out.println();
                System.out.println("-------");

            }
            System.out.print(i + 1 + "|");
        }

    }

}
