package com.example.dz_4_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.dz_4_4.animal.Animal;
import com.example.dz_4_4.databinding.ActivityDetailBinding;
import com.example.dz_4_4.databinding.FragmentDatailBinding;

public class DetailFragment extends Fragment {
    FragmentDatailBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDatailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null){
            Animal animal = (Animal) getArguments().getSerializable("animal");
            binding.textColor.setText(animal.getColor());
            binding.textName.setText(animal.getName());
            binding.textKG.setText(String.valueOf(animal.getSum()));
            Glide.with(binding.Image).load(animal.getImage()).into(binding.Image);
        }
    }
}