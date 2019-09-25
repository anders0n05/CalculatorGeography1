package com.example.calculatorgeography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {






    RadioGroup Radio;
    RadioButton RadioButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button AvancarButton = findViewById(R.id.AvancarButton);
        Radio = findViewById(R.id.radioGroup);
        final RadioButton quadrado = findViewById(R.id.QuadradoButton);
        final RadioButton triangulo = findViewById(R.id.TrianguloButton);
        final RadioButton Circulo = findViewById(R.id.CirculoButton);
        AvancarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quadrado.isChecked()){
                    Intent InputQuadrado = new Intent(MainActivity.this, InputQuadrado.class);
                    startActivity(InputQuadrado);
                    finish();
                }
                else if(Circulo.isChecked()){
                    Intent InputRaio = new Intent(MainActivity.this, InputRaioCirculo.class);
                    startActivity(InputRaio);
                    finish();
                }else if (triangulo.isChecked()){
                    Intent InputRaio = new Intent(MainActivity.this, InputTriangulo.class);
                    startActivity(InputRaio);
                    finish();
                }


            }
        });
    }

}
