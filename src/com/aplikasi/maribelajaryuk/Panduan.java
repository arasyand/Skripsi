package com.aplikasi.maribelajaryuk;

import com.aplikasi.maribelajaryuk.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Panduan extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduan);
        
        TabHost tabHost = getTabHost();
        
        // Tab for Photos
        TabSpec belajarspec = tabHost.newTabSpec("Belajar");
        belajarspec.setIndicator("Belajar", getResources().getDrawable(R.drawable.buttonbelajar));
        Intent belajarIntent = new Intent(this, PanduanBelajar.class);
        belajarspec.setContent(belajarIntent);
        
        // Tab for Songs
        TabSpec bermainspec = tabHost.newTabSpec("Bermain");
        // setting Title and Icon for the Tab
        bermainspec.setIndicator("Bermain", getResources().getDrawable(R.drawable.buttonbermain));
        Intent bermainIntent = new Intent(this, PanduanBermain.class);
        bermainspec.setContent(bermainIntent);
        
        // Tab for Videos
        TabSpec latihanspec = tabHost.newTabSpec("Latihan");
        latihanspec.setIndicator("Latihan", getResources().getDrawable(R.drawable.buttonlatihan));
        Intent latihanIntent = new Intent(this, PanduanLatihan.class);
        latihanspec.setContent(latihanIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(belajarspec); // Adding photos tab
        tabHost.addTab(bermainspec); // Adding songs tab
        tabHost.addTab(latihanspec); // Adding videos tab
    }
}