package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView contacRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacRecyclerview = findViewById(R.id.recyclerview);

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Aneeza Fatima","aneeza4126@gmail.com",R.mipmap.women ));
        contacts.add(new Contact("Faizan Alam","faizan@gmail.com",R.mipmap.cardview ));
        contacts.add(new Contact("Shazia Sharmeen","shazia@gmail.com",R.mipmap.shazia ));
        ContactViewRecycleAdapter adapter = new ContactViewRecycleAdapter();
        adapter.setContacts(contacts);

        contacRecyclerview.setAdapter(adapter);
        contacRecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));


    }
}