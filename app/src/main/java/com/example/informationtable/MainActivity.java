package com.example.informationtable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView rccl_headers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // todo CARREGANDO TÍTULOS -----------------------------------------------------------------
        List<String> headersList = new ArrayList<>();

        headersList.add("Coluna 1");
        headersList.add("Coluna 2");
        headersList.add("Coluna 3");
        headersList.add("Coluna 4");

        /** AJUSTES DO RECYCLERVIEW */
        rccl_headers = (RecyclerView) findViewById(R.id.rccl_headers);
        rccl_headers.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rccl_headers.setLayoutManager(layoutManager);

        // todo CARREGANDO VALORES DAS CÉLULAS DA TABELA -------------------------------------------
        String[][] tableInformations = {
                {"2568", "3254", "568", "2122", "135", "2122"},
                {"235", "421", "570", "113", "1500", "230"},
                {"150", "150", "25", "48", "150", "999"},
                {"336", "478", "7858", "789", "222", "78"}
        };

        /** TRANSFERE AS INFORMAÇÕES PARA O ADAPTADOR */
        /** TRANSFER THE INFORMATION TO THE ADAPTER */
        TableAdapter adapter = new TableAdapter(this, headersList, tableInformations);

        rccl_headers.setAdapter(adapter);
    }
}