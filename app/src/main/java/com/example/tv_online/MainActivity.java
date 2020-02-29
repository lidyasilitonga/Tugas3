package com.example.tv_online;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeam;
    private ArrayList<heroesModel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv_list);
        rvTeam.setHasFixedSize(true);
        list.addAll(heroesData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        heroesAdapter heroesAdapter = new heroesAdapter(this);
        heroesAdapter.setFootbalList(list);
        rvTeam.setAdapter(heroesAdapter);
    }
}