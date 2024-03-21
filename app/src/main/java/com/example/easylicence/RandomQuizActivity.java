package com.example.easylicence;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.easylicence.R;
import com.example.easylicence.models.Quiz;
import com.example.easylicence.models.QuizData;
import java.util.List;
import java.util.Locale;

public class RandomQuizActivity extends AppCompatActivity {
    private static final long TOTAL_TIME_MILLISECONDS = 20 * 60 * 1000;
    TextView questionTextView, totalQuestionTextView, timerTextView;
    Button btn1, btn2, btn3, btn4, btnNext;
    List<Quiz> quizList;
    int currentQuestionIndex = 0;
    private static final long COUNTDOWN_IN_MILLIS = 60000;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis = COUNTDOWN_IN_MILLIS;
    int correctAnswers = 0;

    private void bindingView() {
        questionTextView = findViewById(R.id.question_textview);
        totalQuestionTextView = findViewById(R.id.total_question);
        timerTextView = findViewById(R.id.timer_indicator_textview);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btnNext = findViewById(R.id.btnNext);
    }

    private void bindingAction() {
        btn1.setOnClickListener(this::onBtn1Click);
        btn2.setOnClickListener(this::onBtn2Click);
        btn3.setOnClickListener(this::onBtn3Click);
        btn4.setOnClickListener(this::onBtn4Click);
        btnNext.setOnClickListener(this::onBtnNextClick);
    }

    private void onBtnNextClick(View view) {
        currentQuestionIndex++;
        if (currentQuestionIndex < quizList.size()) {
            displayQuestion();
        } else {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            int totalQuestions = quizList.size();
            Toast.makeText(RandomQuizActivity.this, "Số câu đúng: " + correctAnswers + "/" + totalQuestions, Toast.LENGTH_SHORT).show();
        }
    }

    private void onBtn4Click(View view) {
        checkAnswer(btn4.getText().toString());
    }

    private void onBtn3Click(View view) {
        checkAnswer(btn3.getText().toString());
    }

    private void onBtn2Click(View view) {
        checkAnswer(btn2.getText().toString());
    }

    private void onBtn1Click(View view) {
        checkAnswer(btn1.getText().toString());
    }

    private void checkAnswer(String selectedAnswer) {
        Quiz currentQuiz = quizList.get(currentQuestionIndex);
        if (selectedAnswer.equals(currentQuiz.getCorrectOption())) {
            correctAnswers++;
        }
    }

    private void displayQuestion() {
        Quiz currentQuiz = quizList.get(currentQuestionIndex);
        questionTextView.setText(currentQuiz.getQuestion());
        if (currentQuiz.getOption1() != null && !currentQuiz.getOption1().isEmpty()) {
            btn1.setVisibility(View.VISIBLE);
            btn1.setText(currentQuiz.getOption1());
        } else {
            btn1.setVisibility(View.GONE);
        }
        if (currentQuiz.getOption2() != null && !currentQuiz.getOption2().isEmpty()) {
            btn2.setVisibility(View.VISIBLE);
            btn2.setText(currentQuiz.getOption2());
        } else {
            btn2.setVisibility(View.GONE);
        }
        if (currentQuiz.getOption3() != null && !currentQuiz.getOption3().isEmpty()) {
            btn3.setVisibility(View.VISIBLE);
            btn3.setText(currentQuiz.getOption3());
        } else {
            btn3.setVisibility(View.GONE);
        }
        if (currentQuiz.getOption4() != null && !currentQuiz.getOption4().isEmpty()) {
            btn4.setVisibility(View.VISIBLE);
            btn4.setText(currentQuiz.getOption4());
        } else {
            btn4.setVisibility(View.GONE);
        }
        totalQuestionTextView.setText(String.format(Locale.getDefault(), "Question %d/%d", currentQuestionIndex + 1, quizList.size()));
    }

    private void startCountdownTimer() {
        countDownTimer = new CountDownTimer(TOTAL_TIME_MILLISECONDS, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateCountDownText(millisUntilFinished);
            }

            @Override
            public void onFinish() {
                Toast.makeText(RandomQuizActivity.this, "Time's up!", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }

    private void updateCountDownText(long millisUntilFinished) {
        long minutes = millisUntilFinished / 60000;
        long seconds = (millisUntilFinished % 60000) / 1000;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timerTextView.setText(timeLeftFormatted);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_quiz);
        bindingView();
        bindingAction();
        quizList = QuizData.generateQuizList();
        displayQuestion();
        startCountdownTimer();
    }
}
