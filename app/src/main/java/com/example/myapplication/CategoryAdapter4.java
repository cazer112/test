package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter4 extends RecyclerView.Adapter<CategoryAdapter4.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Integer> states;

    CategoryAdapter4(Context context, List<Integer> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);

    }
    @Override
    public CategoryAdapter4.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.spisok, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter4.ViewHolder holder, int position) {
        Integer state = states.get(position);
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
