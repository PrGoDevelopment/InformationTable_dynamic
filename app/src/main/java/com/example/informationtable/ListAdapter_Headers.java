package com.example.informationtable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter_Headers extends ArrayAdapter<String>
{
    Context ctx;
    int resource;
    List<String> header_list;

    public ListAdapter_Headers(Context ctx, int resource, List<String> header_list){
        super(ctx, resource, header_list);

        this.ctx = ctx;
        this.resource = resource;
        this.header_list = header_list;
    }

    /** PREENCHE O LAYOUT COM AS INFORMAÇÕES PARA FORMAR A LISTA NA TELA */
    /** FILL OUT THE LAYOUT WITH THE INFORMATION TO FORM THE LIST ON THE SCREEN */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater lInflater = LayoutInflater.from(ctx);

        /* SET TO THE ITEM DESIGN THROUGH "resource", FOR EXAMPLE layout_my_list_item.xml SETTED IN ListViewInfo.java */
        View view = lInflater.inflate(resource, null);

        TextView txt_header = view.findViewById(R.id.txt_header);

        txt_header.setText(header_list.get(position));


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx.getApplicationContext(), "Você clicou no " + header_list.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        //Log.d("listAdptr", "Position: " + position);

        return view;
    }
}
