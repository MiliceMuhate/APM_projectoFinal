package com.example.telacadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Exercicio1P extends AppCompatActivity {
    //criar variaveis
    public Button btnRespstaP;
    public RadioButton r1P;
    public RadioButton r2P;
    public RadioButton r3P;
    public TextView resultP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1_fisisca);
        //associar as variaveis aos elementos vorrespondesntes
        btnRespstaP.findViewById(R.id.responderP);
        r1P.findViewById(R.id.radio1P);
        r2P.findViewById(R.id.radio2P);
        r3P.findViewById(R.id.radio3P);
        resultP.findViewById(R.id.respostaP);
        //ao se clicar o botao "responder", deve-se verificar se o radio seleccionado coresponde a resposta certa
        btnRespstaP
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se a resposta for certa uma mensagem sera exibida mostrando a pontucao correspondente ao exercicio em causa
                if(r2P.isSelected()){
                    resultP.setText("Responta certa! pontuou 10V");
                }else{
                    if(r1P.isSelected()||r3P.isSelected()){
                        resultP.setText("Resposta Errada! Nao pontua nada");
                    }
                }
            }
        });
    }
}