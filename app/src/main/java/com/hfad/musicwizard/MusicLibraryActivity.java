package com.hfad.musicwizard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class MusicLibraryActivity extends AppCompatActivity {

    private ListView musicList;
    private SearchView musicSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        wireWidgets();
    }

    private void wireWidgets() {
        musicList = findViewById(R.id.listview_music_list);
        musicSearch = findViewById(R.id.searchbar_music_search);
    }
}
