package com.company;

public class TicTacToe {
    public static final int X = 1;
    public static final int O = -1;
    public static final int EMPTY = 0;
    private int board[][] = new  int[3][3];
    private int player;


    public TicTacToe(){
        clearBoard();
    }

    // clearing the board
    private void clearBoard() {
        for(int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                board[i][j] = EMPTY;
            }
        }
    player = X;
    }

    //test cases (1 ,2 ) (1,3)
    public void putMark(int i , int j) throws IllegalArgumentException {
        if((i > 2) || (i < 0) || (j > 2) || (j < 0)){
            throw new IllegalArgumentException("Invalid board position");
        }
        if(board[i][j] != EMPTY){
            throw new IllegalArgumentException("Board position is occupied at " + i + " , " + j);
        }

        board[i][j] = player; // if player's input passes all condition put X or O in the that position
        player = -player; // switching X and O since X = -O and vice versa
    }



    // 3 0r -3 is the determinant whether a player wins
    private boolean isWin(int player){
        /*
            if the player is X(1) the player's mark is gonna be 3
            or else the player's mark is gonna be -3
         */
        int playerMark = player*3;
        return (
                    board[0][0] + board[1][0] + board[2][0] == playerMark
                ||  board[0][1] + board[1][1] + board[2][1] == playerMark
                ||  board[0][2] + board[1][2] + board[2][2] == playerMark
                ||  board[0][0] + board[0][1] + board[0][2] == playerMark
                ||  board[1][0] + board[1][1] + board[1][2] == playerMark
                ||  board[2][0] + board[2][1] + board[2][2] == playerMark
                ||  board[0][0] + board[1][1] + board[2][2] == playerMark
                ||  board[0][2] + board[1][1] + board[2][0] == playerMark
        );
    }

    public int champion() {
        int winner = 0;

        if (isWin(X))
            winner = X;

        if (isWin(O))
            winner = O;

        if(isWin(X) && isWin(X))
            winner = 0;

        return winner;
    }

    public String current_state_of_the_board(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                switch (board[i][j]){
                    case X :
                        stringBuilder.append("X");
                        break;
                    case O :
                        stringBuilder.append("O");
                        break;
                    case EMPTY:
                        stringBuilder.append("");
                        break;
                }
                if(j < 2) stringBuilder.append("|");
            }
            if (i < 2) stringBuilder.append("\n-----\n");
        }
        return stringBuilder.toString();
    }
}
