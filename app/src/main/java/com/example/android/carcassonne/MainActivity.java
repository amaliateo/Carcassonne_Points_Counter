package com.example.android.carcassonne;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final String STATE_TOTALRED = "totalRed";
    static final String STATE_TOTALYELLOW = "totalYellow";
    int totalRed = 0;
    int totalYellow = 0;
    int tile1 = 0;
    int tile2 = 0;
    int tile3 = 0;
    int tile4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_TOTALRED, totalRed);
        savedInstanceState.putInt(STATE_TOTALYELLOW, totalYellow);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        totalRed = savedInstanceState.getInt(STATE_TOTALRED);
        totalYellow = savedInstanceState.getInt(STATE_TOTALYELLOW);
        displayTotalPlayerOne("Total Red Player: " +totalRed + " points");
        displayTotalPlayerTwo("Total Yellow Player: " + totalYellow + " points");
    }
    public void twoPointsCity(View v) {

        tile1 = tile1 + 1;

        String city = tile1 + " tiles";
        displayForPlayerOne(city);
    }

    public void fourPointsCity(View v) {

        tile2 = tile2 + 1;

        String city = tile2 + " tiles";
        displayCityTiles(city);
    }

    public void redCity(View v) {
        totalRed = totalRed + tile1 * 2 + tile2 * 4;
        String total = "Total Red Player: " + totalRed + " points";
        displayTotalPlayerOne(total);
        tile1 = 0;
        tile2 = 0;
        String City1 = tile1 + " tiles";
        String City2 = tile2 + " tiles";
        displayForPlayerOne(City1);
        displayCityTiles(City2);
    }

    public void yellowCity(View v) {
        totalYellow = totalYellow + tile1 * 2 + tile2 * 4;
        String total = "Total Yellow Player: " + totalYellow + " points";
        displayTotalPlayerTwo(total);
        tile1 = 0;
        tile2 = 0;
        String City1 = tile1 + " tiles";
        String City2 = tile2 + " tiles";
        displayForPlayerOne(City1);
        displayCityTiles(City2);
    }

    public void cloisterTiles(View v) {
        tile3 = tile3 + 1;
        String cloister = tile3 + " tiles";
        displayCloisterTiles(cloister);
    }

    public void redCloister(View v) {
        totalRed = totalRed + tile3;
        String total = "Total Red Player: " + totalRed + " points";
        displayTotalPlayerOne(total);
        tile3 = 0;
        String cloister = tile3 + " tiles";
        displayCloisterTiles(cloister);
    }

    public void yellowCloister(View v) {
        totalYellow = totalYellow + tile3;
        String total = "Total Yellow Player: " + totalYellow + " points";
        displayTotalPlayerTwo(total);
        tile3 = 0;
        String cloister = tile3 + " tiles";
        displayCloisterTiles(cloister);
    }

    public void roadTiles(View v) {
        tile4 = tile4 + 1;
        String road = tile4 + " tiles";
        displayRoadTiles(road);
    }

    public void redRoad(View v) {
        totalRed = totalRed + tile4;
        String total = "Total Red Player: " + totalRed + " points";
        displayTotalPlayerOne(total);
        tile4 = 0;
        String cloister = tile4 + " tiles";
        displayRoadTiles(cloister);
    }

    public void yellowRoad(View v) {
        totalYellow = totalYellow + tile4;
        String total = "Total Yellow Player: " + totalYellow + " points";
        displayTotalPlayerTwo(total);
        tile4 = 0;
        String cloister = tile4 + " tiles";
        displayRoadTiles(cloister);
    }

    public void resetButton1(View v) {
        tile1 = 0;
        tile2 = 0;
        String cloister = tile1 + " tiles";
        String cloisters = tile2 + " tiles";
        displayForPlayerOne(cloister);
        displayCityTiles(cloisters);
    }

    public void resetButton2(View v) {
        tile3 = 0;
        String cloister = tile3 + " tiles";
        displayCloisterTiles(cloister);
    }

    public void resetButton3(View v) {
        tile4 = 0;
        String cloister = tile4 + " tiles";
        displayRoadTiles(cloister);
    }

    public void NewGame(View v) {
        totalRed = 0;
        totalYellow = 0;
        tile1 = 0;
        tile2 = 0;
        tile3 = 0;
        tile4 = 0;
        String total = "Total Yellow Player: " + totalYellow + " points";
        displayTotalPlayerTwo(total);
        String totalred = "Total Red Player: " + totalRed + " points";
        displayTotalPlayerOne(totalred);
    }


    public void displayForPlayerOne(String score) {
        TextView scoreView = (TextView) findViewById(R.id.twopointstiles);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalPlayerOne(String score) {
        TextView scoreView = (TextView) findViewById(R.id.total1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalPlayerTwo(String score) {
        TextView scoreView = (TextView) findViewById(R.id.total2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCityTiles(String score) {
        TextView scoreView = (TextView) findViewById(R.id.fourpointstiles);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCloisterTiles(String score) {
        TextView scoreView = (TextView) findViewById(R.id.cloister1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRoadTiles(String score) {
        TextView scoreView = (TextView) findViewById(R.id.road1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForNewGame(String score) {
        TextView scoreView = (TextView) findViewById(R.id.twopointstiles);
        scoreView.setText(String.valueOf(score));
    }
}