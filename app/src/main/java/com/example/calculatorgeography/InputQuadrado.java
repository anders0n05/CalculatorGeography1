package com.example.calculatorgeography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class InputQuadrado extends AppCompatActivity {
     private EditText baseQuadrado;
     private EditText AlturaQuadrado;
     private EditText Resposta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_quadrado);



         Button Avancar = findViewById(R.id.AvancarQuadrado);

         baseQuadrado = (EditText) findViewById(R.id.BaseQuadrado);
         AlturaQuadrado = (EditText) findViewById(R.id.AlturaQuadrado);
         Resposta = findViewById(R.id.RespostaAreaQuadrado);
    }
   public void onclickBotaoEnviar (View view){
        String base = baseQuadrado.getText().toString();
        String Altura = AlturaQuadrado.getText().toString();
        Intent EnviaResposta = new Intent( getApplicationContext(),PrintAreaQuadrado.class);
        Bundle parametros = new Bundle();

        parametros.putString("chave_base", base);
        parametros.putString("chave_altura",Altura);
        EnviaResposta.putExtras(parametros);
        startActivity(EnviaResposta);
   }
}
