package com.example.calculatorgeography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputTriangulo extends AppCompatActivity {


    private EditText basetriangulo;
    private EditText AlturaTriangulo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_triangulo);
        Button Avancar = findViewById(R.id.AvancarTriangulo);
       basetriangulo = findViewById(R.id.BaseTriangulo);
         AlturaTriangulo= (EditText) findViewById(R.id.AlturaTriangulo);




    }
   public void onclickBotaoEnviarTriangulo(View view) {
        String base =basetriangulo.getText().toString();
        String altura = AlturaTriangulo.getText().toString();
       Bundle parametros = new Bundle();
       parametros.putString("chave_base", base);
       Intent EnviaResposta = new Intent( getApplicationContext(),PrintAreaTriangulo.class);
       parametros.putString("chave_altura",altura);
       EnviaResposta.putExtras(parametros);
       startActivity(EnviaResposta);
    }
}
