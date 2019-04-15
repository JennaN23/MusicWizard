package com.hfad.musicwizard;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import static com.hfad.musicwizard.R.id.navigation_home;

public class MusicLibraryActivity extends AppCompatActivity {

    private ListView musicList;
    private SearchView musicSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation_musicLibrary);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case navigation_home:
                        Intent a = new Intent(MusicLibraryActivity.this, MainActivity.class);
                        startActivity(a);
                        return true;
                    case R.id.navigation_musicLibrary:
                        return true;
                    case R.id.navigation_concerts:
                        Intent b = new Intent(MusicLibraryActivity.this, ConcertActivity.class);
                        startActivity(b);
                        return true;
                }

                return false;
            }
        });

        wireWidgets();
    }

    private void wireWidgets() {
        musicList = findViewById(R.id.listview_music_list);
        musicSearch = findViewById(R.id.searchbar_music_search);
    }
}
