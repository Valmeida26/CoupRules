package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BurguesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_burgues, container, false);

        // Encontrando as views
        TextView textoBurgues = rootView.findViewById(R.id.textoBurgues);
        ImageView imagemBurgues = rootView.findViewById(R.id.imagemBurgues);

        // Configurando o texto e a imagem
        textoBurgues.setText("DIVIDENDOS: Pegue 4 moedas. Outros jogadores também podem declarar influenciar o \"Burguês\". " +
                "Após todas as declarações serem feitas, as contestações \"caso existam\" são resolvidas " +
                "em sentido horário a partir do jogador ativo. O jogador ativo dá 1 moeda para cada declarante " +
                "que não foi contestado com sucesso.");

        imagemBurgues.setImageResource(R.drawable.burgues);  // Certifique-se de ter a imagem "burgues" no drawable

        return rootView;
    }
}
