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
        quizList.add(new Quiz(4, "Người đủ bao nhiêu tuổi trở lên thì được điều khiển xe mô tô hai bánh, xe mô tô ba bánh có dung tích xi lanh từ 50 cm3 trở lên và các loại xe có kết cấu tương tự; xe ô tô tải, máy kéo có trọng tải dưới 3,5 tấn; xe ô tô chở người đến 9 chỗ ngồi?", "1- 16 tuổi.", "2- 18 tuổi.", "3- 17 tuổi.", "", "2-18 tuổi."));
        quizList.add(new Quiz(5,"Người lái xe phải làm gì khi quay đầu xe trên cầu, đường ngầm hay khu vực đường bộ giao nhau cùng mức với đường sắt?","1-Không được quay đầu xe.","2-Lợi dụng chỗ rộng và phải có người làm tín hiệu sau xe để bảo đảm an toàn.","3-Lợi dụng chỗ rộng có thể quay đầu được để quay đầu xe cho an toàn.","","1-Không được quay đầu xe."));
        quizList.add(new Quiz(6,"Người ngồi trên xe mô tô 2 bánh, xe gắn máy phải đội mũ bảo hiểm có cài quai đúng quy cách khi nào?","1-Khi tham gia giao thông đường bộ.","2-Chỉ khi đi trên đường chuyên dùng; đường cao tốc.","3-Khi tham gia giao thông trên đường tỉnh lộ hoặc quốc lộ.","","1-Khi tham gia giao thông đường bộ."));
        quizList.add(new Quiz(7,"Khái niệm phương tiện giao thông cơ giới đường bộ được hiểu thế nào là đúng?","Gồm xe ô tô; máy kéo; xe mô tô hai bánh; xe mô tô ba bánh; xe gắn máy; xe cơ giới dùng cho người khuyết tật và xe máy chuyên dùng.","Gồm xe ô tô; máy kéo; rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo; xe mô tô hai bánh; xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự.","","","Gồm xe ô tô; máy kéo; rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo; xe mô tô hai bánh; xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự."));
        quizList.add(new Quiz(8,"Khái niệm phương tiện giao thông thô sơ đường bộ được hiểu thế nào là đúng?","Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe xích lô, xe lăn dùng cho người khuyết tật, xe súc vật kéo và các loại xe tương tự.","Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe xích lô, xe lăn dùng cho người khuyết tật, xe súc vật kéo và các loại xe tương tự.","Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo.","","Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe xích lô, xe lăn dùng cho người khuyết tật, xe súc vật kéo và các loại xe tương tự."));
        quizList.add(new Quiz(9,"\"Phương tiện tham gia giao thông đường bộ\" gồm những loại nào?","Phương tiện giao thông cơ giới đường bộ."," Phương tiện giao thông thô sơ đường bộ và xe máy chuyên dùng.","Cả ý 1 và ý 2.","","Cả ý 1 và ý 2."));
        quizList.add(new Quiz(10,"\"Người điều khiển phương tiện tham gia giao thông đường bộ\" gồm những đối tượng nào dưới đây?","Người điều khiển xe cơ giới, người điều khiển xe thô sơ.","Người điều khiển xe máy chuyên dùng tham gia giao thông đường bộ.","Cả ý 1 và ý 2.","","Cả ý 1 và ý 2."));
        // Thêm các câu hỏi khác vào đây

        return quizList;
    }
}
