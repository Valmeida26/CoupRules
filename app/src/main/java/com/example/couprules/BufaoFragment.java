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

        textoBufao.setText("Um jogador que reivindica o papel do Bufão pode causar Desordem, tomando uma carta do baralho " +
                "da Corte e um cartão do alvo (outro jogador de sua escolha). O jogador pode alterar " +
                "secretamente uma de suas cartas entre uma das duas cartas recebidas. O jogador retorna " +
                "uma carta para o baralho da Corte e uma carta para o seu alvo (o jogador ao qual havia escolhido).\n" +
                "Pode ser bloqueado pelo capitão");

        imagemBufao.setImageResource(R.drawable.bufao);  // Certifique-se de ter uma imagem chamada bufao

        return rootView;
    }

}
