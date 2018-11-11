package com.example.user.geradordefrases;

import android.support.v7.app.AppCompatActivity;
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
                "O importante não é vencer todos os dias, mas lutar sempre.",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
                "É melhor conquistar a si mesmo do que vencer mil batalhas.",
                "Enquanto houver vontade de lutar haverá esperança de vencer.",
                "Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto.",
                "O medo de perder tira a vontade de ganhar.",
                "Aquele que não tem confiança nos outros, não lhes pode ganhar a confiança.",
                "Escolher o seu tempo é ganhar tempo.",
                "Arriscamo-nos a perder quando queremos ganhar demais.",
                "Perder para a razão, sempre é ganhar.",
                "Muitos sabem ganhar dinheiro, mas poucos sabem gastá-lo.",
                "Se você pretende ser rico, pense em economizar tanto quanto em ganhar.",
                "O homem digno ganha para viver; o menos honesto vive para ganhar.",
                "Não basta conquistar a sabedoria, é preciso usá-la.",
                "Para ganhar aquilo que vale a pena ter, pode ser necessário perder tudo mais."
        };
        int n = new Random().nextInt(frases.length);
        TextView texto = findViewById(R.id.text_resultado);
        texto.setText(frases[n]);
    }
}
