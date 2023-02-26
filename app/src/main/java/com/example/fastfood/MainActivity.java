package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText taikhoan,password;
    Button dangnhap;
    TextView dangky;
    ListView doan;
    ArrayList<monan> food;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taikhoan = findViewById(R.id.taikhoan);
        password = findViewById(R.id.password);
        dangnhap = findViewById(R.id.dangnhap);
        dangky = findViewById(R.id.dangky);
        doan = findViewById(R.id.doan);
        food = new ArrayList<>();

        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dangky.class);
                startActivity(intent);
            }
        });
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dangnhap.class);
                startActivity(intent);
            }
        });
    }
}