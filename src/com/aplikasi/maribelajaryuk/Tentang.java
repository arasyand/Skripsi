package com.aplikasi.maribelajaryuk;

import com.aplikasi.maribelajaryuk.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tentang extends Activity {

	ImageButton btngoogle, btnfacebook, btntwitter;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tentang);

		btngoogle = (ImageButton) findViewById(R.id.btngoogle);
		btnfacebook = (ImageButton) findViewById(R.id.btnfacebook);
		btntwitter = (ImageButton) findViewById(R.id.btntwitter);

		btngoogle.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "https://accounts.google.com/ServiceLogin?service=oz&passive=1209600&continue=https://plus.google.com/?gpsrc%3Dgplp0";
				Intent I = new Intent(Intent.ACTION_VIEW);
				I.setData(Uri.parse(url));
				startActivity(I);
			}
		});

		btnfacebook.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "https://www.facebook.com/";
				Intent I = new Intent(Intent.ACTION_VIEW);
				I.setData(Uri.parse(url));
				startActivity(I);
			}
		});

		btntwitter.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "https://twitter.com/";
				Intent I = new Intent(Intent.ACTION_VIEW);
				I.setData(Uri.parse(url));
				startActivity(I);
			}
		});

	}
}