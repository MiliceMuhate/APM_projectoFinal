package com.example.telacadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.chip.Chip;

public class Categoria extends AppCompatActivity {
    //criar variaveis para os componentes
    public Chip chipM;
    public Chip chipP;
    public Chip chipF;
    public Chip chipQ;
    public Button proxim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        //associar as variaveis criadas com os componetes
        chipM.findViewById(R.id.MatChip);
        chipF.findViewById(R.id.fisicaChip);
        chipQ.findViewById(R.id.quimicaChip);
        chipP.findViewById(R.id.portugesChip);
        proxim.findViewById(R.id.proxBtn);
        //defininir envento para o botao "proximo" para que assim que este for clicado um exercicio da categoria seleccionada
        //sera seleccionado
        proxim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chipM.isChecked()){
                    //chamar tela a ver com matematica
                    Intent intent=new Intent(Categoria.this,Exercicio1.class);
                    startActivity(intent);
                }else{
                    if(chipF.isChecked()){
                        //chamar tela a ver com fisica
                    }
                }
            }
        });
    }
}