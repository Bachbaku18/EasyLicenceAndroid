package com.example.easylicence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);

        LinearLayout Alcohol = (LinearLayout)findViewById(R.id.Alcohol);

        LinearLayout Speed = (LinearLayout)findViewById(R.id.speed);

        LinearLayout ChangeDirect = (LinearLayout)findViewById(R.id.ChangeDirect);

        LinearLayout Horn = (LinearLayout)findViewById(R.id.horn);
        LinearLayout Device = (LinearLayout)findViewById(R.id.device);

        LinearLayout Paper = (LinearLayout)findViewById(R.id.Paper);
        LinearLayout Parking = (LinearLayout)findViewById(R.id.parking);

        LinearLayout Other = (LinearLayout)findViewById(R.id.other);
        LinearLayout Container = (LinearLayout)findViewById(R.id.contain);

        LinearLayout Road = (LinearLayout)findViewById(R.id.Road);
        LinearLayout Traffic = (LinearLayout)findViewById(R.id.traffic);


        Alcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,AlcoholActivity.class);
                startActivity(picture_intent );
            }
        });

        Speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,SpeedActivity.class);
                startActivity(picture_intent );
            }
        });
        Container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,ContainerActivity.class);
                startActivity(picture_intent );
            }
        });
        Device.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,DeviceActivity.class);
                startActivity(picture_intent );
            }
        });
        Horn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,HornActivity.class);
                startActivity(picture_intent );
            }
        });
        Other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,OtherActivity.class);
                startActivity(picture_intent );
            }
        });
       Road.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this, RoadActivity.class);
                startActivity(picture_intent );
            }
        });
        ChangeDirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,ChangeDirectionActivity.class);
                startActivity(picture_intent );
            }
        });
        Paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,PaperActivity.class);
                startActivity(picture_intent );
            }
        });
        Parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,ParkingActivity.class);
                startActivity(picture_intent );
            }
        });
        Traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(LawActivity.this,TrafficSignActivity.class);
                startActivity(picture_intent );
            }
        });
    }
}