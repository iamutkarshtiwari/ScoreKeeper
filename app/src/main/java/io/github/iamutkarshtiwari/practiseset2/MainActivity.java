package io.github.iamutkarshtiwari.scorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.iamutkarshtiwari.scorekeeper.R;

import static android.R.color.white;

public class MainActivity extends AppCompatActivity {


    final int CUSTOM_YELLOW = 0xFFD4E920;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button test1Button = (Button)findViewById(R.id.inning1_button);
        final Button test2Button = (Button)findViewById(R.id.inning2_button);

        View.OnClickListener topButtonsListener  = new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.inning1_button){
                    test1Button.setSelected(true);
                    test2Button.setSelected(false);
                }
                else{
                    test1Button.setSelected(false);
                    test2Button.setSelected(true);
                }
            }
        };
        test1Button.setOnClickListener(topButtonsListener);
        test2Button.setOnClickListener(topButtonsListener);
        test1Button.performClick();

//        TextView mTextView = (TextView)
//        mTextView.setTextSize(16 * getResources().getDisplayMetrics().density);

        // Refresh the stats
        statsRefresh();






    }

    public void statsRefresh() {

        // Team name and main score and stats
        View firstTeamScoreBoard = findViewById(R.id.team1_score_board);
        TextView firstTeamName = (TextView) firstTeamScoreBoard.findViewById(R.id.team_name);
        TextView firstTeamScore = (TextView) firstTeamScoreBoard.findViewById(R.id.score);

        firstTeamScore.setText("0/0");
        firstTeamScore.setTextColor(CUSTOM_YELLOW);

        firstTeamName.setText("Kolkata\nKnight Riders");
        firstTeamName.setTextColor(CUSTOM_YELLOW);

        View secondTeamScoreBoard = findViewById(R.id.team2_score_board);
        TextView secondTeamName = (TextView) secondTeamScoreBoard.findViewById(R.id.team_name);
        TextView secondTeamScore = (TextView) secondTeamScoreBoard.findViewById(R.id.score);

        secondTeamName.setText("Delhi\nDaredevils");

        secondTeamScore.setText(("0/0"));





//        View firstTeamStats =  findViewById(R.id.team1_stats);
//        View secondTeamStats = findViewById(R.id.team2_stats);
//
//        TextView runRate = (TextView) firstTeamStats.findViewById(R.id.run_rate);
//        TextView overs = (TextView) firstTeamStats.findViewById(R.id.overs);
//        TextView ballsLeft = (TextView) firstTeamStats.findViewById(R.id.balls_left);
//
//        setAndRefresh(runRate, 0, Gravity.LEFT, 16);
//        setAndRefresh(overs, 0, Gravity.LEFT, 16);
//        setAndRefresh(ballsLeft, 0, Gravity.LEFT);
//
//        runRate = (TextView) secondTeamStats.findViewById(R.id.run_rate);
//        overs = (TextView) secondTeamStats.findViewById(R.id.overs);
//        ballsLeft = (TextView) secondTeamStats.findViewById(R.id.balls_left);
//
//        setAndRefresh(runRate, 0, Gravity.END);
//        setAndRefresh(overs, 0, Gravity.END);
//        setAndRefresh(ballsLeft, 0, Gravity.END);



    }
//
//    public void setAndRefresh(TextView txtV, int value, int... args) {
//
//        txtV.setText(Integer.toString(value));
//        if (args.length > 0) {
//            txtV.setGravity(args[0]);
//            txtV.layout();
//        }
//
//    }



}
