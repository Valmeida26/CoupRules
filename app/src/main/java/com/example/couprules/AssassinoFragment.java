package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class AssassinoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_assassino, container, false);

        TextView textoAssassino = rootView.findViewById(R.id.textoAssassino);
        ImageView imagemAssassino = rootView.findViewById(R.id.imagemAssassino);

        textoAssassino.setText("ASSASSINAR: Pague 3 moedas para o Tesouro Central e tente assassinar outro jogador. Se for bem sucedido,\n" +
                "aquele jogador perde imediatamente uma inﬂuência.\n" +
                "Pode ser bloqueada pela \"Condessa\"");

        imagemAssassino.setImageResource(R.drawable.assassino);

        return rootView;
    }
}
