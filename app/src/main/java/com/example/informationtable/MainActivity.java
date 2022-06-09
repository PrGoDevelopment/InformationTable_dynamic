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

        // todo LOADING READERS --------------------------------------------------------------------
        List<String> headersList = new ArrayList<>();

        headersList.add("Salário");
        headersList.add("Gastos casa");
        headersList.add("Internet");
//        headersList.add("Teste");
//        headersList.add("Teste2");

        rccl_headers = (RecyclerView) findViewById(R.id.rccl_headers);

        rccl_headers.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rccl_headers.setLayoutManager(layoutManager);



        // todo LOADING TABLE VALUES ---------------------------------------------------------------
        String[][] tableInformations = {
                {"2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122"},
                {"235", "421", "570", "113", "1500", "230", "218", "550", "327", "730", "431", "200"},
                {"150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150"}
        };



        //int s = tableInformations[0].length;

//        String info = "";
//
//        for(int i = 0; i < tableInformations[1].length; i++)
//        {
//            info = tableInformations[1][i];
//        }


        /** TRANSFERE AS INFORMAÇÕES PARA O ADAPTADOR */
        /** TRANSFER THE INFORMATION TO THE ADAPTER */
        TableAdapter adapter = new TableAdapter(this, headersList, tableInformations);

        rccl_headers.setAdapter(adapter);
    }
}