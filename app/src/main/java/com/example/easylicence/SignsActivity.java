package com.example.easylicence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import com.example.easylicence.adapter.SignsAdapter;
import com.example.easylicence.models.TrafficSigns;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<TrafficSigns> signs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs);

        recyclerView = findViewById(R.id.recyclerview);
        signs = new ArrayList<>();
        signs.add(new TrafficSigns("P.101","Biển báo Đường cấm",R.drawable.signp101));
        signs.add(new TrafficSigns("P.102","Biển báo Cấm đi ngược chiều",R.drawable.signp102));
        signs.add(new TrafficSigns("P.103a","Biển báo Cấm xe ô tô",R.drawable.signp103a));
        signs.add(new TrafficSigns("P.103b","Biển báo Cấm xe ô tô rẽ phải ",R.drawable.signp103b));
        signs.add(new TrafficSigns("P.103c","Biển báo Cấm xe ô tô rẽ trai ",R.drawable.signp103c));
        signs.add(new TrafficSigns("P.104","Biển báo Cấm mô tô",R.drawable.signp104));
        signs.add(new TrafficSigns("P.105","Biển báo Cấm ô tô và mô tô",R.drawable.signp105));
        signs.add(new TrafficSigns("P.123a","Biển báo Cấm rẽ trái ",R.drawable.signp123a));
        signs.add(new TrafficSigns("P.123b","Biển báo Cấm rẽ phải",R.drawable.signp123b));
        signs.add(new TrafficSigns("P.128","Biển báo Cấm bóp còi",R.drawable.signp128));
        signs.add(new TrafficSigns("P.130","Biển báo Cấm dừng và đỗ xe",R.drawable.signp130));
        signs.add(new TrafficSigns("P.136","Biển báo Cấm đi thẳng",R.drawable.signp136));
        signs.add(new TrafficSigns("W.201a","Biển báo chỗ ngoặt nguy hiểm bên trái",R.drawable.signw201a));
        signs.add(new TrafficSigns("W.201b","Biển báo chỗ ngoặt nguy hiểm bên phải",R.drawable.signw201b));
        signs.add(new TrafficSigns("W.201c","Biển báo chỗ ngoặt nguy hiểm có nguy cơ lật bên phải",R.drawable.signw201c));
        signs.add(new TrafficSigns("W.201d","Biển báo chỗ ngoặt nguy hiểm có nguy cơ lật bên trái",R.drawable.signw201d));
        signs.add(new TrafficSigns("W.202a","Biển báo nhiều chỗ ngoặt nguy hiểm liên tiếp nhau",R.drawable.signw202a));
        signs.add(new TrafficSigns("W.202b","Biển báo nhiều chỗ ngoặt nguy hiểm liên tiếp nhau",R.drawable.signw202b));
        signs.add(new TrafficSigns("W.203a","Biển báo đường bị hẹp hai bên",R.drawable.signw203a));
        signs.add(new TrafficSigns("W.203b","Biển báo đường bị hẹp bên trái",R.drawable.signw203b));
        signs.add(new TrafficSigns("W.203c","Biển báo đường bị hẹp bên phải",R.drawable.signw203c));
        signs.add(new TrafficSigns("W.204","Biển báo đường hai chiều",R.drawable.signw204));
        signs.add(new TrafficSigns("W.205a","Biển báo nơi giao nhau của đường đồng cấp",R.drawable.signw205a));
        signs.add(new TrafficSigns("W.205b","Biển báo nơi giao nhau của đường đồng cấp",R.drawable.signw205b));
        signs.add(new TrafficSigns("R.122","Biển báo dừng lại",R.drawable.signr122));
        signs.add(new TrafficSigns("R.301a","Biển báo các xe chỉ được đi thẳng",R.drawable.signr301a));
        signs.add(new TrafficSigns("R.301b","Biển báo các xe chỉ được rẽ phải",R.drawable.signr301b));
        signs.add(new TrafficSigns("R.301c","Biển báo các xe chỉ được rẽ trái",R.drawable.signr301c));
        signs.add(new TrafficSigns("R.301d","Biển báo các xe chỉ được rẽ phải",R.drawable.signr301d));
        signs.add(new TrafficSigns("R.301e","Biển báo các xe chỉ được rẽ trái",R.drawable.signr301e));
        signs.add(new TrafficSigns("R.301f","Biển báo các xe chỉ được đi thẳng và rẽ phải ",R.drawable.signr301f));
        signs.add(new TrafficSigns("R.301g","Biển báo các xe chỉ được đi thẳng và rẽ trái",R.drawable.signr301g));
        signs.add(new TrafficSigns("R.301h","Biển báo các xe chỉ được rẽ trái và phải",R.drawable.signr301h));
        signs.add(new TrafficSigns("R.303","Biển báo nơi giao nhau chạy theo vòng xuyến",R.drawable.signr303));
        signs.add(new TrafficSigns("R.304","Biển báo đường dành cho xe thô sơ",R.drawable.signr304));
        signs.add(new TrafficSigns("R.305","Biển báo đường dành riêng cho người đi bộ",R.drawable.signr305));
        signs.add(new TrafficSigns("Vạch 1.1","Vạch phân chia hai chiều xe chạy (vạch tím đường), dạng vạch đơn, đứt nét",R.drawable.signg11));
        signs.add(new TrafficSigns("Vạch 1.2","Vạch phân chia hai chiều xe chạy (vạch tím đường), dạng vạch đơn, nét liền ",R.drawable.signg12));
        signs.add(new TrafficSigns("Vach 1.3","Vạch phân chia hai chiều xe chạy (vạch tím đường), dạng vạch đơn, nét liền ",R.drawable.signg13));
        signs.add(new TrafficSigns("Vạch 1.4","Vạch phân chia hai chiều xe chạy, dạng vạch đôi gồm một vạch nét liền, một vạch nét đứt",R.drawable.signg14));
        signs.add(new TrafficSigns("Vạch 1.5","Vạch phân chia các làn xe cùng chiều, dạng vạch đơn, liền nét",R.drawable.signg15));
        signs.add(new TrafficSigns("Vạch 2.1","Vạch phân chia các làn xe cùng chiều, dạng vạch đơn, đứt nét",R.drawable.signg21));
        signs.add(new TrafficSigns("Vach 2.2","Vạch phân chia các làn xe cùng chiều, dạng vạch đơn, đứt nét",R.drawable.signg22));
        signs.add(new TrafficSigns("Vạch 7.6","Vạch sắp đến nơi bố trí vạch đi bộ qua đường", R.drawable.signg76));
        signs.add(new TrafficSigns("Vach 7.8","Vạch xác định khoảng cách xe trên đường",R.drawable.signg78));
        signs.add(new TrafficSigns("Vạch 9.2","Vạch quy định chỗ dừng đỗ của phương tiên giao thông công cộng",R.drawable.signg92));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SignsAdapter(getApplicationContext(),signs));









    }


}