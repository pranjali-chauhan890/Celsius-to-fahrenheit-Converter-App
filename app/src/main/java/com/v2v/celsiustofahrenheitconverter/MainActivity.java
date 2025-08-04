package com.v2v.celsiustofahrenheitconverter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;






import android.os.Bundle;
import android.widget .*;
import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

        EditText etCelsius;
        Button btnConvert;
        TextView tvResult;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            etCelsius = findViewById(R.id.etCelsius);
            btnConvert = findViewById(R.id.btnConvert);
            tvResult = findViewById(R.id.tvResult);

            btnConvert.setOnClickListener(v -> {
                String celsiusStr = etCelsius.getText().toString().trim();

                if (celsiusStr.isEmpty()) {
                    etCelsius.setError("Please enter temperature in °C");
                    return;
                }

                double celsius = Double.parseDouble(celsiusStr);
                double fahrenheit = (celsius * 9 / 5) + 32;

                String result = String.format("%.1f°C = %.1f°F", celsius, fahrenheit);
                tvResult.setText(result);
                Button btnClear = findViewById(R.id.btnClear);

                btnClear.setOnClickListener(view -> {
                    etCelsius.setText("");
                    tvResult.setText("");
                });
            });
        }
    }

