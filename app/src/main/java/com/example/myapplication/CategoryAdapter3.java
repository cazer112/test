package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter3 extends RecyclerView.Adapter<CategoryAdapter3.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Integer> states;

    private final MainActivity5.ProductOnClick productOnClick;

    CategoryAdapter3(Context context, List<Integer> states, MainActivity5.ProductOnClick productOnClick) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
        this.productOnClick = productOnClick;
    }
    @Override
    public CategoryAdapter3.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter3.ViewHolder holder, int position) {
        Integer state = states.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productOnClick.onclick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ViewHolder(View view){
            super(view);


        }
    }

}
