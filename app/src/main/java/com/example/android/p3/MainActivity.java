package com.example.android.p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the show score button is clicked and it checks if the
     * the right answer was checked.
     */

    public void showScore(View view) {
        RadioButton question1 = findViewById(R.id.q1_a4);
        boolean correctA1 = question1.isChecked();

        RadioButton question2 = findViewById(R.id.q2_a3);
        boolean correctA2 = question2.isChecked();

        CheckBox firstCheckBox = findViewById(R.id.q3_a1);
        boolean correctA3_1 = firstCheckBox.isChecked();

        CheckBox secondCheckBox = findViewById(R.id.q3_a2);
        boolean correctA3_2 = secondCheckBox.isChecked();

        CheckBox thirdCheckBox = findViewById(R.id.q3_a3);
        boolean correctA3_3 = thirdCheckBox.isChecked();

        CheckBox forthCheckBox = findViewById(R.id.q3_a4);
        boolean correctA3_4 = forthCheckBox.isChecked();

        CheckBox fifthCheckBox = findViewById(R.id.q3_a5);
        boolean correctA3_5 = fifthCheckBox.isChecked();

        EditText question4 = findViewById(R.id.q4_a);
        String userAnswer1 = question4.getText().toString();

        RadioButton question5 = findViewById(R.id.q5_a3);
        boolean correctA5_3 = question5.isChecked();

        RadioButton question6 = findViewById(R.id.q6_a3);
        boolean correctA6 = question6.isChecked();

        EditText question7 = findViewById(R.id.q7_a);
        String userAnswer2 = question7.getText().toString();

        int score = calculateScore(correctA1, correctA2, correctA3_1, correctA3_2, correctA3_3, correctA3_4, correctA3_5, userAnswer1, correctA5_3,
                correctA6, userAnswer2);
        displayScore(score);
    }

    /**
     * This method is calculating final score for quiz
     */

    private int calculateScore(boolean addOneForQ1, boolean addOneForQ2,
                               boolean firstCorrectCheckForQ3,
                               boolean secondCorrectCheckForQ3,
                               boolean thirdCorrectCheckForQ3,
                               boolean forthCorrectCheckForQ3,
                               boolean fifthCorrectCheckForQ3, String playerAnswer,
                               boolean addOnePointForQ5, boolean addOneForQ6, String playerAnswer2) {
        int initialResult = 0;

        if (addOneForQ1) {
            initialResult = initialResult + 1;
        }

        if (addOneForQ2) {
            initialResult = initialResult + 1;
        }

        if (firstCorrectCheckForQ3 && secondCorrectCheckForQ3 && forthCorrectCheckForQ3 && !thirdCorrectCheckForQ3 && !fifthCorrectCheckForQ3) {
            initialResult = initialResult + 1;
        }


        if (playerAnswer.equalsIgnoreCase("Tommy")) {
            initialResult = initialResult + 1;
        }


        if (addOnePointForQ5) {
            initialResult = initialResult + 1;
        }

        if (addOneForQ6) {
            initialResult = initialResult + 1;
        }

        if (playerAnswer2.equalsIgnoreCase("Chuck Berry")) {
            initialResult = initialResult + 1;
        }
        return initialResult;
    }

    /**
     * This method will display final result
     */

    private void displayScore(

            int scoreForPlayer) {
        TextView scoreAfterQuiz = findViewById(R.id.final_score);
        if (scoreForPlayer == 7) {
            Toast.makeText(getApplicationContext(),
                    "WooHoo! You are a Rock Star!", Toast.LENGTH_LONG).show();
        } else if (scoreForPlayer >= 3) {
            Toast.makeText(getApplicationContext(),
                    "Not Bad! Your score is: " + scoreForPlayer + " out of 7! ", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),
                    "Who are you? Justin Bieber? Your score is: " + scoreForPlayer + " out of 7! ", Toast.LENGTH_LONG).show();
        }
        scoreAfterQuiz.setText("" + scoreForPlayer);
    }

    public void reset(View v) {

        RadioButton question1_a = findViewById(R.id.q1_a1);
        question1_a.setChecked(false);

        RadioButton question1_b = findViewById(R.id.q1_a2);
        question1_b.setChecked(false);

        RadioButton question1_c = findViewById(R.id.q1_a3);
        question1_c.setChecked(false);

        RadioButton question1_d = findViewById(R.id.q1_a4);
        question1_d.setChecked(false);

        RadioButton question2_a = findViewById(R.id.q2_a1);
        question2_a.setChecked(false);

        RadioButton question2_b = findViewById(R.id.q2_a2);
        question2_b.setChecked(false);

        RadioButton question2_c = findViewById(R.id.q2_a3);
        question2_c.setChecked(false);

        RadioButton question2_d = findViewById(R.id.q2_a4);
        question2_d.setChecked(false);

        CheckBox firstCheckBox = findViewById(R.id.q3_a1);
        firstCheckBox.setChecked(false);

        CheckBox secondCheckBox = findViewById(R.id.q3_a2);
        secondCheckBox.setChecked(false);

        CheckBox thirdCheckBox = findViewById(R.id.q3_a3);
        thirdCheckBox.setChecked(false);

        CheckBox forthCheckBox = findViewById(R.id.q3_a4);
        forthCheckBox.setChecked(false);

        CheckBox fifthCheckBox = findViewById(R.id.q3_a5);
        fifthCheckBox.setChecked(false);

        EditText question4 = findViewById(R.id.q4_a);
        question4.setText("");

        RadioButton question5_a = findViewById(R.id.q5_a1);
        question5_a.setChecked(false);

        RadioButton question5_b = findViewById(R.id.q5_a2);
        question5_b.setChecked(false);

        RadioButton question5_c = findViewById(R.id.q5_a3);
        question5_c.setChecked(false);

        RadioButton question5_d = findViewById(R.id.q5_a4);
        question5_d.setChecked(false);

        RadioButton question6_a = findViewById(R.id.q6_a1);
        question6_a.setChecked(false);

        RadioButton question6_b = findViewById(R.id.q6_a2);
        question6_b.setChecked(false);

        RadioButton question6_c = findViewById(R.id.q6_a3);
        question6_c.setChecked(false);

        RadioButton question6_d = findViewById(R.id.q6_a4);
        question6_d.setChecked(false);

        EditText question7 = findViewById(R.id.q7_a);
        question7.setText("");

        TextView scoreAfterQuiz = findViewById(R.id.final_score);
        scoreAfterQuiz.setText("0");

        //displayScore(0);
    }
}