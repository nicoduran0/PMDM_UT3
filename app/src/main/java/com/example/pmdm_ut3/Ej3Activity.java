package com.example.pmdm_ut3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Ej3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej3);

        findViewById(R.id.btnA).setOnClickListener(v -> startActivity(new Intent(this, Ej3AActivity.class)));
        findViewById(R.id.btnB).setOnClickListener(v -> startActivity(new Intent(this, Ej3BActivity.class)));
        findViewById(R.id.btnC).setOnClickListener(v -> startActivity(new Intent(this, Ej3CActivity.class)));
    }
}
