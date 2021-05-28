package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NonConstantResourceId")
    public void irAlCurriculum(View view) {

        String app = "https://*-Se agrega el ngrok-*";

        switch (view.getId()) {
            case R.id.btn_angelica:
                app = "https://*-Se agrega el ngrok-*/329528.json";

                break;

            case R.id.btn_martin:
                app = "https://*-Se agrega el ngrok-*/319094.json";
                break;

            case R.id.btn_daniel:
                app = "https://*-se agrega el ngrok-*/329694.json";
                break;
            default:
        }

        Intent i = new Intent(this, CV.class);
            i.putExtra("app",app);
        startActivity(i);
    }
}
