package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RomancActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romanc);


        ArrayList<SongInfo> Rinfo= new ArrayList<>();

        Rinfo.add(new SongInfo("Hamaki","Haga Mastkhbya"));
        Rinfo.add(new SongInfo("Amr Diab ","Osad Einy"));
        Rinfo.add(new SongInfo("Sherin","Hobo Gana"));

        SongInfoAdapter adapter= new SongInfoAdapter(this,Rinfo);

        ListView listview= findViewById(R.id.listRom);
        listview.setAdapter(adapter);
    }
}
