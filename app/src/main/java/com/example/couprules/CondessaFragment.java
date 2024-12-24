package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CondessaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_condessa, container, false);

        // Encontrando as views
        TextView textoCondessa = rootView.findViewById(R.id.textoCondessa);
        ImageView imagemCondessa = rootView.findViewById(R.id.imagemCondessa);

        // Configurando o texto e a imagem
        textoCondessa.setText("A Condessa pode bloquear um Assassino ou um Capitão. Se o jogador " +
                "realizar um golpe contra ela, a ação é anulada.\n" +
                "Bloqueia Assassinato");

        imagemCondessa.setImageResource(R.drawable.condessa);  // Certifique-se de ter a imagem "condessa" no drawable

        return rootView;
    }
}
