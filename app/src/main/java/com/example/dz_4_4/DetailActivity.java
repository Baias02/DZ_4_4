package com.example.dz_4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dz_4_4.animal.Animal;
import com.example.dz_4_4.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Animal animal =(Animal) getIntent().getSerializableExtra("animal");

        DetailFragment fragment = new DetailFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable("animal", animal);
        fragment.setArguments(bundle);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_view, fragment)
                .commit();
    }
}