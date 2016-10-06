package com.example.user3.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    private TextView teamA;
    private TextView teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA = (TextView)findViewById(R.id.team_a_score);
        teamB = (TextView)findViewById(R.id.team_b_score);
    }

    public void addThreePointsForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePointsForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamA(int score)
    {


        teamA.setText(String.valueOf(score));
    }

    public void addThreePointsForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointsForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void addOnePointsForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score)
    {


        teamB.setText(String.valueOf(score));
    }

    public void resetScores(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;

        teamA.setText(String.valueOf(scoreTeamA));
        teamB.setText(String.valueOf(scoreTeamB));
    }


}
