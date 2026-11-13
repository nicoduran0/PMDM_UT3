package com.example.pmdm_ut3;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ej5Activity extends AppCompatActivity {

    TextView pantalla;
    double primero = 0;
    String operador = null;
    boolean nuevo = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej5);
        pantalla = findViewById(R.id.tvPantalla);
    }

    public void onNumero(View v) {
        String t = ((Button) v).getText().toString();
        String actual = pantalla.getText().toString();

        if (nuevo) {
            actual = t.equals(".") ? "0." : t;
            nuevo = false;
        } else {
            if (t.equals(".") && actual.contains(".")) return;
            if (actual.equals("0") && !t.equals(".")) actual = t;
            else actual += t;
        }
        pantalla.setText(actual);
    }

    public void onOperador(View v) {
        if (pantalla.getText().toString().equals("Error")) return;
        if (operador != null && !nuevo) calcular();
        if (pantalla.getText().toString().equals("Error")) return;

        primero = Double.parseDouble(pantalla.getText().toString());
        operador = ((Button) v).getText().toString();
        nuevo = true;
    }

    public void onIgual(View v) {
        if (operador == null || nuevo) return;
        calcular();
        operador = null;
        nuevo = true;
    }

    public void onClear(View v) {
        pantalla.setText("0");
        primero = 0;
        operador = null;
        nuevo = true;
    }

    private void calcular() {
        double segundo = Double.parseDouble(pantalla.getText().toString());
        double r;
        switch (operador) {
            case "+": r = primero + segundo; break;
            case "-": r = primero - segundo; break;
            case "*": r = primero * segundo; break;
            case "/":
                if (segundo == 0) {
                    pantalla.setText("Error");
                    operador = null;
                    nuevo = true;
                    return;
                }
                r = primero / segundo;
                break;
            default: return;
        }

        if (r == (long) r) pantalla.setText(String.valueOf((long) r));
        else pantalla.setText(String.valueOf(r));
    }
}
