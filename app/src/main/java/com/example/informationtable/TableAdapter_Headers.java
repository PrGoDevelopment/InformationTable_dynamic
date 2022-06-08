package com.example.informationtable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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




//            final String[] str = {"one","two","three","asdfgf"};
//            final RelativeLayout rl = (RelativeLayout) holder.itemView.findViewById(R.id.rl);
//            final TextView[] tv = new TextView[10];
//
//            for (int i=0; i<str.length; i++)
//            {
//                tv[i] = new TextView(ctx);
//                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams
//                        ((int) RelativeLayout.LayoutParams.WRAP_CONTENT,(int) RelativeLayout.LayoutParams.WRAP_CONTENT);
//                params.leftMargin = 50;
//                params.topMargin  = i*50;
//                tv[i].setText(str[i]);
//                tv[i].setTextSize((float) 20);
//                tv[i].setPadding(20, 50, 20, 50);
//                tv[i].setLayoutParams(params);
//                rl.addView(tv[i]);
//            }






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
        TextView txt_header, txt_valueTable;
        LinearLayout ll_mainLayoutTable;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_header = itemView.findViewById(R.id.txt_header);
            txt_valueTable = itemView.findViewById(R.id.txt_valueTable);
            ll_mainLayoutTable = itemView.findViewById(R.id.ll_mainLayoutTable);

            RelativeLayout rl_main = (RelativeLayout) itemView.findViewById(R.id.rl_main);



            for(int i = 0; i < 3; i++){
                //rl_main.addView(txt_valueTable);

                TextView t = new TextView(ctx);

                //ll_mainLayoutTable.addView(t);
                rl_main.addView(t);
            }











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
