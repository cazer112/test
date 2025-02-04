package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<String> states;

    CategoryAdapter(Context context, List<String> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);

    }
        @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.button, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.ViewHolder holder, int position) {
        String state = states.get(position);
        holder.flagView.setText(state);
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final Button flagView;

        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.buton);

        }
    }

}
