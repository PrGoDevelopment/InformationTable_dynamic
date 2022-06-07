package com.example.informationtable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TableAdapter_Headers extends RecyclerView.Adapter<TableAdapter_Headers.ViewHolder>
{
    Context ctx;
    List<String> header_list;

    public TableAdapter_Headers(Context ctx, List<String> header_list){
        this.ctx = ctx;
        this.header_list = header_list;
    }

    @NonNull
    @Override
    public TableAdapter_Headers.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.design_headers, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TableAdapter_Headers.ViewHolder holder, int position) {
        if(header_list != null && header_list.size() > 0)
        {
            holder.txt_header.setText(header_list.get(position));
        }else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return header_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txt_header;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_header = itemView.findViewById(R.id.txt_header);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(ctx.getApplicationContext(), "Você clicou no " + txt_header.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }









//    /** PREENCHE O LAYOUT COM AS INFORMAÇÕES PARA FORMAR A LISTA NA TELA */
//    /** FILL OUT THE LAYOUT WITH THE INFORMATION TO FORM THE LIST ON THE SCREEN */
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater lInflater = LayoutInflater.from(ctx);
//
//        /* SET TO THE ITEM DESIGN THROUGH "resource", FOR EXAMPLE layout_my_list_item.xml SETTED IN ListViewInfo.java */
//        View view = lInflater.inflate(resource, null);
//
//        TextView txt_header = view.findViewById(R.id.txt_header);
//
//        txt_header.setText(header_list.get(position));
//
//
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(ctx.getApplicationContext(), "Você clicou no " + header_list.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        //Log.d("listAdptr", "Position: " + position);
//
//        return view;
//    }
}
