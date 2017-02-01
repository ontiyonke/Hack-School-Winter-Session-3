package com.acmhack.ucla.tictactoeskeleton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    // optional variables

    int activePlayer;
    boolean gameIsActive;
    int[] gameState;
    int[][] winningPositions;

    //This function should be used to drop in image views when pressed
    //it should update the game state and active player
    //it should determine if somebody has won the game
    //if game is over it should display a dialog indicating winner
    //it should check for draws
    //Optional: Add in animation that causes tiles to fly in or fade in
    public void dropIn(View view) {

    }

    //Should reset game to initial state, and update all variables
    //It should hide dialog box
    public void playAgain(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
