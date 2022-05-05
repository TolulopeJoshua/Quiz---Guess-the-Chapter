package com.bibleworld.biblequiz_guessthebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuestionReview extends AppCompatActivity {

    public void restart(View view) {
        int LAUNCH_SECOND_ACTIVITY = 1;
        Intent i = new Intent(QuestionReview.this, StartPage.class);
        startActivityForResult(i, LAUNCH_SECOND_ACTIVITY);
        finish();
    }

                        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_review);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        String questionsReview = intent.getStringExtra("Text");

        TextView textView = findViewById(R.id.quesionReviewTextView);
        textView.setText(questionsReview);
    }
}