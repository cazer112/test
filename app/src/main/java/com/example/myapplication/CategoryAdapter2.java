package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter2 extends RecyclerView.Adapter<CategoryAdapter2.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Integer> states;

    CategoryAdapter2(Context context, List<Integer> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);

    }
        @Override
    public CategoryAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.nike, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter2.ViewHolder holder, int position) {
        Integer state = states.get(position);
        holder.flagView.setImageResource(state);
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;

        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.nike);

        }
    }

}
