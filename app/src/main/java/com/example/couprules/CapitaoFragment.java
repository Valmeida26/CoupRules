package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class CapitaoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflando o layout do fragmento
        View rootView = inflater.inflate(R.layout.fragment_capitao, container, false);

        // Referência para o TextView e ImageView
        TextView textoCapitao = rootView.findViewById(R.id.textoCapitao);
        ImageView imagemCapitao = rootView.findViewById(R.id.imagemCapitao);

        // Configurar o texto e a imagem
        textoCapitao.setText("Pegue duas moedas de outro jogador, Se ele só tiver uma moeda, pegue " +
                "apenas uma. (Pode ser bloqueada pelo Embaixador/Inquisidor ou Capitão)\n" +
                "Bloqueia Extorsão");
        imagemCapitao.setImageResource(R.drawable.capitao); // Assumindo que você tenha a imagem 'capitao' na pasta drawable

        return rootView;
    }
}

