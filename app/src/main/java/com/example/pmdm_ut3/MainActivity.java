package com.example.pmdm_ut3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnEj1).setOnClickListener(v -> startActivity(new Intent(this, Ej1Activity.class)));
        findViewById(R.id.btnEj2).setOnClickListener(v -> startActivity(new Intent(this, Ej2Activity.class)));
        findViewById(R.id.btnEj3).setOnClickListener(v -> startActivity(new Intent(this, Ej3Activity.class)));
        findViewById(R.id.btnEj4).setOnClickListener(v -> startActivity(new Intent(this, Ej4Activity.class)));
        findViewById(R.id.btnEj5).setOnClickListener(v -> startActivity(new Intent(this, Ej5Activity.class)));
        findViewById(R.id.btnEj6).setOnClickListener(v -> startActivity(new Intent(this, Ej6Activity.class)));
    }
}
