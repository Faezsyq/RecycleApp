package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ContactModel> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
    }
    private void addData(){
        elements = new ArrayList<>();
        elements.add(new ContactModel("#989342", "Faiz", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Izal", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Han", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Nif", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Asy", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Sya", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Asysya", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Syauqi", "085150021000","Not Available"));
        elements.add(new ContactModel("#989342", "Uqi", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Syauq", "085150021000","Available"));
        elements.add(new ContactModel("#989342", "Faizal", "085150021000","Available"));

        ContactAdapter adapter = new ContactAdapter(elements, this, new ContactAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ContactModel item) {
                detail(item);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.rvKontak);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    private void detail (ContactModel item){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("contactmodel", item);
        startActivity(intent);
    }
}