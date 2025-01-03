package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BurocrataFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_burocrata, container, false);

        // Encontrando as views
        TextView textoBurocrata = rootView.findViewById(R.id.textoBurocrata);
        ImageView imagemBurocrata = rootView.findViewById(R.id.imagemBurocrata);

        // Configurando o texto e a imagem
        textoBurocrata.setText("COOPERAÇÃO: Pegue 3 moedas do Tesouro Central e entregue 1 moeda para um adversário.\n" +
                "Bloqueia ajuda externa.");

        imagemBurocrata.setImageResource(R.drawable.burocrata);  // Certifique-se de ter a imagem "burocrata" no drawable

        return rootView;
    }
}
