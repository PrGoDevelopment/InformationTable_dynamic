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

public class TableAdapter_Values extends RecyclerView.Adapter<TableAdapter_Values.ViewHolder>
{
    Context ctx;
    List<String> values_list;

    public TableAdapter_Values(Context ctx, List<String> values_list){
        this.ctx = ctx;
        this.values_list = values_list;
    }

    @NonNull
    @Override
    public TableAdapter_Values.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.design_values, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TableAdapter_Values.ViewHolder holder, int position) {
        if(values_list != null && values_list.size() > 0)
        {
            holder.txt_value.setText(values_list.get(position));
        }else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return values_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txt_value;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_value = itemView.findViewById(R.id.txt_value);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(ctx.getApplicationContext(), "Você clicou no " + txt_value.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
