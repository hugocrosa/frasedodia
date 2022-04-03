package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "A misericórdia é a melhor parte da justiça.",
                "Nunca se arrependa. Se é bom, é maravilhoso. Se é ruim, é experiência.",
                "Não adie terminar com alguém quando você sabe que quer. Prolongar a situação só piora.",
                "Se você estiver se sentindo para baixo, tente segurar um lápis entre o lábio superior e o nariz por cinco minutos.",
                "Não tente dar partida em uma motocicleta em uma estrada gelada.",
                "Se você tiver a chance, aproveite!"
        };
        int numero = new Random().nextInt( 4);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );

    }

}