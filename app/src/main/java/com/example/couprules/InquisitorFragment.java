package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class InquisitorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_inquisidor, container, false);

        // Encontrando as views
        TextView textoInquisidor = rootView.findViewById(R.id.textoInquisitor);
        ImageView imagemInquisidor = rootView.findViewById(R.id.imagemInquisitor);

        // Configurando o texto e a imagem
        textoInquisidor.setText("O Inquisidor pode forçar um jogador a mostrar suas cartas. " +
                "Além disso, ele pode bloquear um golpe de 'acusar' ou 'desafiar'.\n" +
                "Bloqueia Extorsão");

        imagemInquisidor.setImageResource(R.drawable.inquisitor);  // Certifique-se de ter a imagem "inquisidor" no drawable

        return rootView;
    }
}
