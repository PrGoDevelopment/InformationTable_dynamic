package com.example.informationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    ListView listView_headers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> titlesTable = new ArrayList<>();

        titlesTable.add("Salário");
        titlesTable.add("Gastos casa");
        titlesTable.add("Internet");

        listView_headers = (ListView) findViewById(R.id.listView_headers);

        /** TRANSFERE AS INFORMAÇÕES PARA O ADAPTADOR */
        /** TRANSFER THE INFORMATION TO THE ADAPTER */
        ListAdapter_Headers adapter = new ListAdapter_Headers(this, R.layout.design_headers, titlesTable);

        listView_headers.setAdapter(adapter);

        String[][] tableInformations = {
                {"2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122"},
                {"235", "421", "570", "113", "1500", "230", "218", "550", "327", "730", "431", "200"},
                {"150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150"}
        };
    }
}