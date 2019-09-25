package com.example.calculatorgeography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputRaioCirculo extends AppCompatActivity {
    private EditText Raio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_raio_circulo);

        Button AvancarRaio = findViewById(R.id.AvancarRaio);

        Raio = findViewById(R.id.RaioInput);



    }


    public void onclickBotaoEnviarCirculo(View view) {
        String circle = Raio.getText().toString();
        Intent EnviaResposta = new Intent( getApplicationContext(),PrintAreaCirculo.class);
        Bundle parametros = new Bundle();

        parametros.putString("chave_circle", circle);

        EnviaResposta.putExtras(parametros);
        startActivity(EnviaResposta);
    }
}
