package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BufaoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bufao, container, false);

        TextView textoBufao = rootView.findViewById(R.id.textoBufao);
        ImageView imagemBufao = rootView.findViewById(R.id.imagemBufao);

        textoBufao.setText("DESORDEM: Primeiro pegue uma carta aleatória do baralho da Corte e uma das cartas de um adversário. \"Escolhida pelo adversário.\"\n" +
                "Você pode trocar uma dessas cartas por uma de suas cartas, depois devolva uma carta para o baralho da Corte e uma para o adversário escolhido.\n" +
                "BLOQUEIA DESORDEM: O jogador alvo da Desordem, pode declatar possuir o \"Bufão\" e bloquear a Desordem.\n" +
                "\"O jogador que usar o Bufão ainda pode pegar e trocar uma carta do baralho da Corte.\"\n" +
                "Bloqueia extorsão.\n");

        imagemBufao.setImageResource(R.drawable.bufao);  // Certifique-se de ter uma imagem chamada bufao

        return rootView;
    }

}
