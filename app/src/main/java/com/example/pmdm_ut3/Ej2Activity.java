package com.example.pmdm_ut3;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Ej2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej2);

        findViewById(R.id.btnIr).setOnClickListener(v -> {

            Intent intent = new Intent(this, Ej2DestinoActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(
                    this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

            Toast.makeText(this, "Navegando en 10 segundos...", Toast.LENGTH_SHORT).show();


            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException e) {
                    e.printStackTrace();
                }
            }, 10000);
        });
    }
}
