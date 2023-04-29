package com.example.dz_4_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.dz_4_4.animal.Animal;
import com.example.dz_4_4.databinding.ActivityMainBinding;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity implements AnimalClick {
        AnimalAdapter adapter;
        ArrayList<Animal> arrayList;

        ActivityMainBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            fillList();
            initAdapter();
        }

        private void fillList() {
            arrayList = new ArrayList<>();
            arrayList.add(new Animal("Snake", 2, "black", "https://proprikol.ru/wp-content/uploads/2019/09/kartinki-krasivye-zmei-11.jpg"));
            arrayList.add(new Animal("Lion", 200, "gold", "http://img-fotki.yandex.ru/get/6834/136137676.10/0_1024f8_9b9781c3_XXXL.jpg"));
            arrayList.add(new Animal("Dog", 30, "brown", "https://get.wallhere.com/photo/dog-puppy-mammal-lawn-vertebrate-dog-like-mammal-dog-crossbreeds-dog-breed-guard-dog-dogue-de-bordeaux-tosa-590165.jpg"));
            arrayList.add(new Animal("Dragons", 500, "red", "https://avatars.mds.yandex.net/i?id=7d269c80ed06914a38ac36875f73c86b2746cf32-9181638-images-thumbs&n=13"));
        }

        private void initAdapter() {
            adapter = new AnimalAdapter(arrayList, this);
            binding.recyclerView.setAdapter(adapter);
        }

        @Override
        public void animalClicked(Animal animal) {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("animal", animal);
            startActivity(intent);
        }
    }
