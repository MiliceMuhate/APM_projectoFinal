package com.example.telacadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEntrar extends AppCompatActivity {
    public Button t2btnRegisto;
    public Button t2btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_entrar);

        t2btnRegisto = findViewById(R.id.registarBtnT2);
        t2btnRegisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TelaEntrar.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //botao para entrar e chamar a tela de categoria
        t2btnEntrar = findViewById(R.id.entrarBtnT2);
        t2btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TelaEntrar.this,Categoria.class);
                startActivity(intent);
            }
        });
    }
}