package com.example.dz_4_4;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dz_4_4.animal.Animal;
import com.example.dz_4_4.databinding.ItemSvoi1Binding;


public class AnimalHolder extends RecyclerView.ViewHolder {

      ItemSvoi1Binding binding;
    public AnimalHolder(@NonNull ItemSvoi1Binding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Animal animal) {
        Glide.with(binding.imageView).load(animal.getImage()).into(binding.imageView);
        binding.textView.setText(animal.getName());

    }
}
