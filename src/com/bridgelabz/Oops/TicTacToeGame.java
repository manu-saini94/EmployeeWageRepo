package com.bridgelabz.Oops;

public class TicTacToeGame {

    public void initializeBoard(){
        char[] board = new char[10];
        for (int i=1;i<board.length-1;i++){
            board[i] = ' ';
        }
        System.out.println("m1() method");
    }

    public static void main(String[] args) {
        TicTacToeGame obj = new TicTacToeGame();
        obj.initializeBoard();

    }


}

