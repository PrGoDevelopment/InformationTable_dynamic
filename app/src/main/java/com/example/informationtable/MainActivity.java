package com.example.informationtable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    /* https://www.youtube.com/watch?v=pOeEq6utNU8 -> 10:42 min */

    RecyclerView recycler_view;
    ValueAdapter valueAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);

        SetRecyclerView();
    }

    void SetRecyclerView(){
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));

        valueAdapter = new ValueAdapter(this, GetList());

        recycler_view.setAdapter(valueAdapter);






        /** SIMULAÇÃO DA TABELA DO PROJETO POCKET */

        String[] titlesTable = {"Salário", "Gastos casa", "Internet"};

        String[][] tableInformations = {
                {"2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122", "2122"},
                {"235", "421", "570", "113", "1500", "230", "218", "550", "327", "730", "431", "200"},
                {"150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150", "150"}
        };

        /** ------------------------------------- */
    }

    TableRow tbR_row;

    List<ValueModel> GetList(){

        tbR_row = findViewById(R.id.tbR_row);
        //tbR_row = new TextView()

        List<ValueModel> valueModel_List = new ArrayList<>();

        valueModel_List.add(new ValueModel("1", "Beutrano", "248"));
        valueModel_List.add(new ValueModel("2", "Ciclano", "125"));
        valueModel_List.add(new ValueModel("3", "Brigilda", "472"));
        valueModel_List.add(new ValueModel("4", "Manuella", "525"));
        valueModel_List.add(new ValueModel("5", "Benicio", "781"));
        valueModel_List.add(new ValueModel("6", "Cassia", "610"));

        return valueModel_List;
    }
}