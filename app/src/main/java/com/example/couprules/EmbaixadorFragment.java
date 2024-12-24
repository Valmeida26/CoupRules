package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class EmbaixadorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_embaixador, container, false);

        // Encontrando as views
        TextView textoEmbaixador = rootView.findViewById(R.id.textoEmbaixador);
        ImageView imagemEmbaixador = rootView.findViewById(R.id.imagemEmbaixador);

        // Configurando o texto e a imagem
        textoEmbaixador.setText("Pegue duas cartas aleatórias do Baralho da Corte e junte com\n" +
                "suas cartas ainda viradas para baixo. Em seguida, escolha\n" +
                "e embaralhe duas destas no Baralho da Corte. Você deve\n" +
                "continuar com o mesmo número de influências que tinha\n" +
                "antes da ação." +
                "Bloqueia Extorsão");

        imagemEmbaixador.setImageResource(R.drawable.embaixador);  // Certifique-se de ter a imagem "embaixador" no drawable

        return rootView;
    }
}
