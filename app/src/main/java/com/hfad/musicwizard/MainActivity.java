package com.hfad.musicwizard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import retrofit2.Callback;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private SearchView search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation_main_navbar);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        return true;
                    case R.id.navigation_musicLibrary:
                        Intent a = new Intent(MainActivity.this, MusicLibraryActivity.class);
                        startActivity(a);
                        return true;
                    case R.id.navigation_concerts:
                        Intent b = new Intent(MainActivity.this, ConcertActivity.class);
                        startActivity(b);

                        return true;
                }
                return false;
            }


        });





        wireWidgets();
    }

    private void wireWidgets() {
        search = findViewById(R.id.searchbar_main_search);
    }



}
