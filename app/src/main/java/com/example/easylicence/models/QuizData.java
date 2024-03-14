package com.example.easylicence.models;

import java.util.ArrayList;
import java.util.List;

public class QuizData {
    public static List<Quiz> generateQuizList() {
        List<Quiz> quizList = new ArrayList<>();

        // Thêm câu hỏi vào danh sách
        // Ví dụ:
        quizList.add(new Quiz(1, "Phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại là gì?", "Phần mặt đường và lề đường", "Phần đường xe chạy", "Phần đường xe cơ giới", "", "Phần đường xe chạy"));
        quizList.add(new Quiz(2, "Khi vào số để khởi hành xe ô tô có số tự động, người lái xe phải thực hiện các thao tác nào để đảm bảo an toàn?", "Đạp bàn đạp phanh chân hết hành trình, vào số và nhả phanh tay, kiểm tra lại xem có bị nhầm số không rồi mới cho xe lăn bánh", "Đạp bàn đạp để tăng ga với mức độ phù hợp, vào số và kiểm tra lại xem có bị nhầm số không rồi mới cho xe lăn bánh.", "", "", "Đạp bàn đạp phanh chân hết hành trình, vào số và nhả phanh tay, kiểm tra lại xem có bị nhầm số không rồi mới cho xe lăn bánh."));
        quizList.add(new Quiz(3, "Hành vi nào dưới đây bị nghiêm cấm?", "Đỗ xe trên đường phố.", "Sử dụng xe đạp đi trên các tuyến quốc lộ có tốc độ cao", "làm hỏng (cố ý) cọc tiêu, gương cầu, dải phân cách.", "Sử dụng còi và quay đầu xe trong khu dân cư", "Làm hỏng (cố ý) cọc tiêu, gương cầu, dải phân cách."));
        quizList.add(new Quiz(4, "Đây là tại sao", "Không biết", "Biết không", "Ai biết", "Biết đâu", "Ai biết"));
        quizList.add(new Quiz(4, "Đây là tại sao", "Không biết", "Biết không", "", "", "Không biết"));

        // Thêm các câu hỏi khác vào đây

        return quizList;
    }
}
