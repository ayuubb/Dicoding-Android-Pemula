package com.ayproject.submission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHandphone;
    private ArrayList<Handphone> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHandphone = findViewById(R.id.rv_hp);
        rvHandphone.setHasFixedSize(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        list.addAll(HandphoneData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHandphone.setLayoutManager(new LinearLayoutManager(this));
        ListHpAdapter listHpAdapter = new ListHpAdapter(list);
        rvHandphone.setAdapter(listHpAdapter);

        listHpAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Handphone handphone) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.ITEM_EXTRA, handphone);
                startActivity(intent);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.super_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}