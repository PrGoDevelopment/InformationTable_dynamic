package com.example.informationtable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ValueAdapter extends RecyclerView.Adapter<ValueAdapter.ViewHolder>
{
    Context context;
    List<ValueModel> valueModelsList;

    public ValueAdapter(Context context, List<ValueModel> valueModelsList) {
        this.context = context;
        this.valueModelsList = valueModelsList;
    }

    @NonNull
    @Override
    public ValueAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_table, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ValueAdapter.ViewHolder holder, int position) {
        if(valueModelsList != null && valueModelsList.size() > 0)
        {
            ValueModel valueModel = valueModelsList.get(position);
            holder.tbv_id.setText(valueModel.getId());
            holder.tbv_name.setText(valueModel.getName());
            holder.tbv_value.setText(valueModel.getValue());
        }else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return valueModelsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tbv_id, tbv_name, tbv_value;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tbv_id = itemView.findViewById(R.id.tbv_id);
            tbv_name = itemView.findViewById(R.id.tbv_name);
            tbv_value = itemView.findViewById(R.id.tbv_value);
        }
    }
}
