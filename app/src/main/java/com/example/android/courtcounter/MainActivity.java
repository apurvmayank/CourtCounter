package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int totalA=0;
    int totalB=0;
    public void increment3forA(View view){
        totalA=totalA+3;
        displayForTeamA(totalA);
    }
    public void increment2forA(View view){
        totalA=totalA+2;
        displayForTeamA(totalA);
    }
    public void incrementthrowforA(View view){
        totalA=totalA+1;
        displayForTeamA(totalA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void increment3forB(View view){
        totalB=totalB+3;
        displayForTeamB(totalB);
    }
    public void increment2forB(View view){
        totalB=totalB+2;
        displayForTeamB(totalB);
    }
    public void incrementthrowforB(View view){
        totalB=totalB+1;
        displayForTeamB(totalB);
    }
    public void reset(View view){
        totalB=0;
        totalA=0;
        displayForTeamB(totalB);
        displayForTeamA(totalA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
