package com.example.miprimerproyectoandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        Button btnEnter = findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(v->{
            Toast.makeText(MainActivity.this, "Entrando a la app", Toast.LENGTH_SHORT).show();
        });

    }
}