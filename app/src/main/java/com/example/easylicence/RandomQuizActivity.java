package com.example.easylicence;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylicence.models.Quiz;
import com.example.easylicence.models.QuizData;

import java.util.List;
import java.util.Locale;

public class RandomQuizActivity extends AppCompatActivity {
    private static final long TOTAL_TIME_MILLISECONDS = 20 * 60 * 1000; // 20 phút expressed in milliseconds
    // Khai báo các view
    TextView questionTextView;
    Button btn1, btn2, btn3, btn4, btnNext;
    TextView totalQuestionTextView, timerTextView;
    // Khai báo danh sách câu hỏi
    List<Quiz> quizList;
    // Biến đếm câu hỏi
    int currentQuestionIndex = 0;
    // Biến đếm thời gian
    private static final long COUNTDOWN_IN_MILLIS = 60000; // 60 seconds
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis = COUNTDOWN_IN_MILLIS;
    int correctAnswers = 0;

    private void bindingView() {
        questionTextView = findViewById(R.id.question_textview);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btnNext = findViewById(R.id.btnNext);
        totalQuestionTextView = findViewById(R.id.total_question);
        timerTextView = findViewById(R.id.timer_indicator_textview);

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
            // Nếu đã đến câu hỏi cuối cùng, dừng CountdownTimer
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }

            // Hiển thị kết quả cuối cùng
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

//    private void displayQuestion() {
//        Quiz currentQuiz = quizList.get(currentQuestionIndex);
//        questionTextView.setText(currentQuiz.getQuestion());
//        btn1.setText(currentQuiz.getOption1());
//        btn2.setText(currentQuiz.getOption2());
//        btn3.setText(currentQuiz.getOption3());
//        btn4.setText(currentQuiz.getOption4());
//
//        // Cập nhật bộ đếm câu hỏi
//        totalQuestionTextView.setText(String.format(Locale.getDefault(), "Question %d/%d", currentQuestionIndex + 1, quizList.size()));
//    }

    private void displayQuestion() {
        Quiz currentQuiz = quizList.get(currentQuestionIndex);
        questionTextView.setText(currentQuiz.getQuestion());

        // Hiển thị đáp án nếu chúng được cung cấp
        if (currentQuiz.getOption1() != null && !currentQuiz.getOption1().isEmpty()) {
            btn1.setVisibility(View.VISIBLE);
            btn1.setText(currentQuiz.getOption1());
        } else {
            btn1.setVisibility(View.GONE);
        }

        if (currentQuiz.getOption2() != null && !currentQuiz.getOption2().isEmpty()) {
            btn2.setVisibility(View.VISIBLE);
            btn2.setText( currentQuiz.getOption2());
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

        // Cập nhật bộ đếm câu hỏi
        totalQuestionTextView.setText(String.format(Locale.getDefault(), "Question %d/%d", currentQuestionIndex + 1, quizList.size()));
    }

    private void startCountdownTimer() {
        countDownTimer = new CountDownTimer(TOTAL_TIME_MILLISECONDS, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Update the TextView displaying the remaining time
                updateCountDownText(millisUntilFinished);
            }

            @Override
            public void onFinish() {
                // Handle when the countdown timer finishes
                // For example, display a message or end the quiz
                // You can add your logic here
                Toast.makeText(RandomQuizActivity.this, "Time's up!", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
    private void updateCountDownText(long millisUntilFinished) {
        // Convert milliseconds to minutes and seconds
        long minutes = millisUntilFinished / 60000;
        long seconds = (millisUntilFinished % 60000) / 1000;

        // Format the time as "mm:ss" and display it in the TextView
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

        // Ánh xạ các view từ layout
        bindingView();
        bindingAction();
        // Khởi tạo danh sách câu hỏi từ dữ liệu được sinh ra
        quizList = QuizData.generateQuizList();
        // Hiển thị câu hỏi đầu tiên
        displayQuestion();
        // Khởi tạo bộ đếm thời gian
        startCountdownTimer();




    }

}
