package com.example.telacadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Exercicio1 extends AppCompatActivity {
    //criar variaveis
    public Button btnRespsta;
    public RadioButton r1;
    public RadioButton r2;
    public RadioButton r3;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);
        //associar as variaveis aos elementos vorrespondesntes
        btnRespsta.findViewById(R.id.responderBtn);
        r1.findViewById(R.id.radio1);
        r2.findViewById(R.id.radio2);
        r3.findViewById(R.id.radio3);
        result.findViewById(R.id.respostaText);
        //ao se clicar o botao "responder", deve-se verificar se o radio seleccionado coresponde a resposta certa
        btnRespsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se a resposta for certa uma mensagem sera exibida mostrando a pontucao correspondente ao exercicio em causa
                if(r2.isSelected()){
                    result.setText("Responta certa! pontuou 10V");
                }else{
                    if(r1.isSelected()||r3.isSelected()){
                        result.setText("Resposta Errada! Nao pontua nada");
                    }
                }
            }
        });
    }
}