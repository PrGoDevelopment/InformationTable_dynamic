package com.example.informationtable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView rccl_headers, rccl_values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // todo LOADING READERS --------------------------------------------------------------------
        List<String> headersList = new ArrayList<>();

        headersList.add("Salário");
        headersList.add("Gastos casa");
        headersList.add("Internet");

        rccl_headers = (RecyclerView) findViewById(R.id.rccl_headers);

        rccl_headers.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rccl_headers.setLayoutManager(layoutManager);

        /** TRANSFERE AS INFORMAÇÕES PARA O ADAPTADOR */
        /** TRANSFER THE INFORMATION TO THE ADAPTER */
        TableAdapter_Headers adapter = new TableAdapter_Headers(this, headersList);

        rccl_headers.setAdapter(adapter);

        // todo LOADING TABLE VALUES ---------------------------------------------------------------
        String[][] tableInformations = {
                {"2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122"},
                {"235", "421", "570", "113", "1500", "230", "218", "550", "327", "730", "431", "200"},
                {"150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150"}
        };

        List<String> valuesList = new ArrayList<>();

        valuesList.add("2122");
        valuesList.add("235");
        valuesList.add("150");

        rccl_values = (RecyclerView) findViewById(R.id.rccl_values);

        rccl_values.setHasFixedSize(true);
        LinearLayoutManager layoutManager_Values = new LinearLayoutManager(this);
        layoutManager_Values.setOrientation(LinearLayoutManager.HORIZONTAL);
        rccl_values.setLayoutManager(layoutManager_Values);

        /** TRANSFERE AS INFORMAÇÕES PARA O ADAPTADOR */
        /** TRANSFER THE INFORMATION TO THE ADAPTER */
        TableAdapter_Values adapterValues = new TableAdapter_Values(this, valuesList);

        rccl_values.setAdapter(adapterValues);
    }
}