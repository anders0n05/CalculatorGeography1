package com.example.calculatorgeography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrintAreaQuadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_area_quadrado);
        EditText texto = (EditText)findViewById(R.id.RespostaAreaQuadrado);
        Button Voltar = findViewById(R.id.VoltarQuadrado);
        Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TelaPrincipal= new Intent(PrintAreaQuadrado.this, MainActivity.class);
                startActivity(TelaPrincipal);
                finish();
            }
        });
        Intent Recebe = getIntent();
        Bundle parametros  = Recebe.getExtras();
        if (parametros!=null){
            String base = parametros.getString("chave_base");
            String altura = parametros.getString("chave_altura");
            Integer.parseInt(base);
            Integer.parseInt(altura);

          int area =  Integer.parseInt(base)* Integer.parseInt(altura);
            // texto.setText(base);
             texto.setText(String.valueOf(area));

            Toast.makeText(PrintAreaQuadrado.this , base,Toast.LENGTH_LONG).show();
        }
    }
}
