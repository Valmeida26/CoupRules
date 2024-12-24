package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BenfeitorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_benfeitor, container, false);

        TextView textoBenfeitor = rootView.findViewById(R.id.textoBenfeitor);
        ImageView imagemBenfeitor = rootView.findViewById(R.id.imagemBenfeitor);

        textoBenfeitor.setText("Pegue 3 moedas do jogador com mais moedas e as dê para o jogador com" +
                " menos moedas. Em caso de empate, o jogador ativo decide quem é o alvo.");

        imagemBenfeitor.setImageResource(R.drawable.benfeitor);

        return rootView;
    }

}
