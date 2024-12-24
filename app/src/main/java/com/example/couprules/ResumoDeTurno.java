package com.example.couprules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ResumoDeTurno extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflando o layout do fragmento
        View rootView = inflater.inflate(R.layout.fragment_resumodeturno, container, false);

        // Referência para o TextView e ImageView
        ImageView imagemResumoDeTurno = rootView.findViewById(R.id.imagemResumoDeTurno);

        imagemResumoDeTurno.setImageResource(R.drawable.resumodeturno); // Assumindo que você tenha a imagem 'capitao' na pasta drawable

        return rootView;
    }
}

