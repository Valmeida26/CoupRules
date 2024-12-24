package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DuqueFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_duque, container, false);

        // Encontrando as views
        TextView textoDuque = rootView.findViewById(R.id.textoDuque);
        ImageView imagemDuque = rootView.findViewById(R.id.imagemDuque);

        // Configurando o texto e a imagem
        textoDuque.setText("O Duque pode pegar 3 moedas do banco ou bloquear um golpe de 'roubo' feito pelo Capitão.\n" +
                "Bloqueia Ajuda Externa");

        imagemDuque.setImageResource(R.drawable.duque);  // Certifique-se de ter a imagem "duque" no drawable

        return rootView;
    }
}
