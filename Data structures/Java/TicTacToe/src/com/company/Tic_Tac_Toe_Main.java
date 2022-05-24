package com.company;

public class Tic_Tac_Toe_Main {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        // first player is always x
        ticTacToe.putMark(0, 0); // X
        ticTacToe.putMark(0, 1); // O
        ticTacToe.putMark(0, 2); // X
        ticTacToe.putMark(1, 0); // O
        ticTacToe.putMark(1, 2); // X
        ticTacToe.putMark(1, 1); // O
        ticTacToe.putMark(2, 0); // X
        ticTacToe.putMark(2, 1); // O
        ticTacToe.putMark(2, 2); // X

        int champion = ticTacToe.champion();
        String outcome[] = {"O wins", "Tie", "X wins"};
        /*
            if X wins then champion = 1 , outcome[1 + 1] => "X wins"
            if O wins then champion = -1 , outcome[1 + -1] => "O wins"
            if None wins then champion = 0, outcome[1 + 0] => "Tie"
            so the arrangement of outcomeArray matters so much
         */
        System.out.println(outcome[1 + champion]);
    }

    /*
        Operations performed by an array:
            -Insertion : places an element at a particular index  O(n)
            -Deletion  : removes an element at particular index   O(n)
            -Update    : changes the value of the element at the given index    O(n)
            -Transversing: moving through each element of an array
            -Search    : Finds the particular index of an element   O(n)
     */
}
