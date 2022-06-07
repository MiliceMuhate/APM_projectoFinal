package com.example.telacadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Exercicio1Q extends AppCompatActivity {
    //criar variaveis
    public Button btnRespstaQ;
    public RadioButton r1Q;
    public RadioButton r2Q;
    public RadioButton r3Q;
    public TextView resultQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1_q);
        //associar as variaveis aos elementos vorrespondesntes
        btnRespstaQ.findViewById(R.id.responderQ);
        r1Q.findViewById(R.id.radio1Q);
        r2Q.findViewById(R.id.radio1Q);
        r3Q.findViewById(R.id.radio3Q);
        resultQ.findViewById(R.id.respostaQ);
        //ao se clicar o botao "responder", deve-se verificar se o radio seleccionado coresponde a resposta certa
        btnRespstaQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se a resposta for certa uma mensagem sera exibida mostrando a pontucao correspondente ao exercicio em causa
                if(r3Q.isSelected()){
                    resultQ.setText("Responta certa! pontuou 10V");
                }else{
                    if(r1Q.isSelected()||r2Q.isSelected()){
                        resultQ.setText("Resposta Errada! Nao pontua nada");
                    }
                }
            }
        });
    }
}