package com.hfad.musicwizard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class ConcertActivity extends AppCompatActivity {

    private ListView concertList;
    private SearchView concertSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert);

        wireWidgets();
    }

    private void wireWidgets() {
        concertList = findViewById(R.id.listview_concert_list);
        concertSearch = findViewById(R.id.searchbar_concert_search);
    }
}
