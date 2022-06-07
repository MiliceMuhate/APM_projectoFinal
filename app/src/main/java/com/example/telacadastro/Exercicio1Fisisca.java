package com.example.telacadastro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Exercicio1Fisisca extends AppCompatActivity {
    //criar variaveis
    public Button btnRespstaF;
    public RadioButton r1F;
    public RadioButton r2F;
    public RadioButton r3F;
    public TextView resultF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1_fisisca);
        //associar as variaveis aos elementos vorrespondesntes
        btnRespstaF.findViewById(R.id.responderF);
        r1F.findViewById(R.id.radio1F);
        r2F.findViewById(R.id.radio2F);
        r3F.findViewById(R.id.radio3F);
        resultF.findViewById(R.id.respostaF);
        //ao se clicar o botao "responder", deve-se verificar se o radio seleccionado coresponde a resposta certa
        btnRespstaF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se a resposta for certa uma mensagem sera exibida mostrando a pontucao correspondente ao exercicio em causa
                if(r1F.isSelected()){
                    resultF.setText("Responta certa! pontuou 10V");
                }else{
                    if(r2F.isSelected()||r3F.isSelected()){
                        resultF.setText("Resposta Errada! Nao pontua nada");
                    }
                }
            }
        });
    }
}