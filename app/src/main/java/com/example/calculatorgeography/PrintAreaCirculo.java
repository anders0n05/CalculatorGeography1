package com.example.calculatorgeography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrintAreaCirculo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_area_circulo);
        EditText texto = (EditText)findViewById(R.id.AreaRespostaCircle);
        Button Voltar = findViewById(R.id.VoltarCircle);
        Voltar.setOnClickListener(new View.OnClickListener() { // voltando tela principal
            @Override
            public void onClick(View v) {
                Intent TelaPrincipal= new Intent(PrintAreaCirculo.this, MainActivity.class);
                startActivity(TelaPrincipal);
                finish();
            }
        });
        Intent Recebe = getIntent();
        Bundle parametros  = Recebe.getExtras();
        if (parametros!=null){
            String raio= parametros.getString("chave_circle");
            Integer.parseInt(raio);
           int raio_int = Integer.parseInt(raio);


            int area = (int) ((raio_int*raio_int) * Math.PI);
            // texto.setText(base);
            texto.setText(String.valueOf(area)) ;
           // texto.setText(raio);

        }
    }
}
