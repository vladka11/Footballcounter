package com.example.android.footballcounter;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    int goalA;
    int goalB;
    int shotPGA;
    int shotPGB;
    int cornerA;
    int cornerB;
    int directA;
    int directB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goalA(View view){
        goalA++;
        displayA(goalA);
    }

    public void displayA(int skore){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(skore));
    }

    public void goalB(View view){
        goalB++;
        displayB(goalB);
    }

    public void displayB(int skore){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(skore));
    }

    public void resetSkore(View view){
        displayA(0);
        displayB(0);
        displayPGA(0);
        displayPGB(0);
        displayCornerA(0);
        displayCornerB(0);
        displayDirectA(0);
        displayDirectB(0);
    }


    //shots PG
    public void shotPGA(View view){
        shotPGA++;
        displayPGA(shotPGA);
    }

    public void displayPGA(int skore){
        TextView scoreView = (TextView) findViewById(R.id.shotPG_Ateam);
        scoreView.setText(String.valueOf(skore));
    }

    public void shotPGB(View view){
        shotPGB++;
        displayPGB(shotPGB);
    }

    public void displayPGB(int skore){
        TextView scoreView = (TextView) findViewById(R.id.shotPG_Bteam);
        scoreView.setText(String.valueOf(skore));
    }

    //Corner
    public void cornerA(View view){
        cornerA++;
        displayCornerA(cornerA);
    }
    public void displayCornerA(int skore){
        TextView scoreView = (TextView) findViewById(R.id.corner_Ateam);
        scoreView.setText(String.valueOf(skore));
    }

    public void cornerB(View view){
        cornerB++;
        displayCornerB(cornerB);
    }
    public void displayCornerB(int skore){
        TextView scoreView = (TextView) findViewById(R.id.corner_Bteam);
        scoreView.setText(String.valueOf(skore));
    }

    //Direct kick
    public void directA(View view){
        directA++;
        displayDirectA(directA);
    }
    public void displayDirectA(int skore){
        TextView scoreView = (TextView) findViewById(R.id.direct_Ateam);
        scoreView.setText(String.valueOf(skore));
    }
    public void directB(View view){
        directB++;
        displayDirectB(directB);
    }
    public void displayDirectB(int skore){
        TextView scoreView = (TextView) findViewById(R.id.direct_Bteam);
        scoreView.setText(String.valueOf(skore));
    }

}
