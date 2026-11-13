package com.example.pmdm_ut3;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Ej1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1);

        EditText etUrl = findViewById(R.id.etUrl);

        findViewById(R.id.btnAbrir).setOnClickListener(v -> {
            String url = etUrl.getText().toString().trim();

            if (url.isEmpty() || !Patterns.WEB_URL.matcher(url).matches()) {
                Toast.makeText(this, "Introduce una URL válida", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "https://" + url;
            }

            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "No hay ninguna app para abrir la URL", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
