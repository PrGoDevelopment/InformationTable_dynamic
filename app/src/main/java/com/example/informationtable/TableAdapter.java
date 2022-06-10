package com.example.informationtable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.ViewHolder>
{
    Context ctx;
    List<String> header_list;
    String[][] tableInformations;

    public TableAdapter(Context ctx, List<String> header_list, String[][] tableInformations){
        this.ctx = ctx;
        this.header_list = header_list;
        this.tableInformations = tableInformations;
    }

    @NonNull
    @Override
    public TableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.design_table, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull TableAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        if(header_list != null && header_list.size() > 0)
        {
            holder.txt_header.setText(header_list.get(position));


            for (int i = 0; i < tableInformations[position].length; i++)
            {
                TextView tvw = new TextView(ctx);

                tvw.setText(tableInformations[position][i]);
                tvw.setTextSize((float) 22);
                tvw.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                tvw.setBackground(holder.itemView.getResources().getDrawable(R.drawable.border_table));

                /** PARA CLICAR EM CADA CELULA */
                int finalIndex = i;
                tvw.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctx.getApplicationContext(), "Você clicou no " + tableInformations[position][finalIndex] + " do " + holder.txt_header.getText(), Toast.LENGTH_SHORT).show();
                    }
                });

                holder.ll_mainLayoutTable.addView(tvw);
            }

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
        LinearLayout ll_mainLayoutTable;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_header = itemView.findViewById(R.id.txt_header);
            ll_mainLayoutTable = itemView.findViewById(R.id.ll_mainLayoutTable);

            /** PARA CLICAR EM CADA COLUNA, ATRAVÉZ DOS TÍTULOS */
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(ctx.getApplicationContext(), "Você clicou no " + txt_header.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
