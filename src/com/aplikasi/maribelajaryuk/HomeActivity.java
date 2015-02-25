package com.aplikasi.maribelajaryuk;

import com.aplikasi.maribelajaryuk.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class HomeActivity extends Activity {

	ImageView btnbelajar, btnlatihan, btnbermain, btntentang, btnpanduan,
			btnmusik, btnmenu;
	MediaPlayer audio;
	
	boolean klik = true;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepage);

		audio = MediaPlayer.create(this, R.raw.sound);
		audio.setLooping(true);
		audio.setVolume(1, 1);
//		audio.start();

		btnbelajar = (ImageView) findViewById(R.id.btnbelajar);
		btnlatihan = (ImageView) findViewById(R.id.btnlatihan);
		btnbermain = (ImageView) findViewById(R.id.btnbermain);
		btntentang = (ImageView) findViewById(R.id.btntentang);
		btnpanduan = (ImageView) findViewById(R.id.btnpanduan);
		btnmusik = (ImageView) findViewById(R.id.btnmusik);
		btnmenu = (ImageView) findViewById(R.id.btnmenu);

		menugone();
		
		final MediaPlayer tombol = MediaPlayer.create(this, R.raw.button);
		
		btnmenu.setOnClickListener(new View.OnClickListener() {	
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			tombol.start();
			if (klik) {
				menuvisible();
			} else {
				menugone();				
			}
		}
	});
		
		btnbelajar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tombol.start();
				menugone();
				Intent i = new Intent(HomeActivity.this, TigaButton.class);
				String belajar = "belajar";
				i.putExtra("id", belajar);
				startActivity(i);
				
			}
		});
		btnlatihan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tombol.start();
				menugone();
				Intent i = new Intent(HomeActivity.this, TigaButton.class);
				String latihan = "latihan";
				i.putExtra("id1", latihan);
				startActivity(i);
			}
		});
		btnbermain.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tombol.start();
				menugone();
				Intent i = new Intent(HomeActivity.this, TigaButton.class);
				String bermain = "bermain";
				i.putExtra("id2", bermain);
				startActivity(i);
			}
		});
		
		
		btntentang.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tombol.start();
				menugone();
				Intent i = new Intent(HomeActivity.this, Tentang.class);
				startActivity(i);
			}
		});
		btnpanduan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tombol.start();
				menugone();
				Intent i = new Intent(HomeActivity.this, Panduan.class);
				startActivity(i);
			}
		});
		btnmusik.setOnClickListener(new View.OnClickListener() {

			private boolean music = true;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tombol.start();
				if (music) {
					music = false;
					btnmusik.setImageResource(R.drawable.musikklik);
					/* Mematikan suara audio */
					audio.setVolume(0, 0);

				} else {
					music = true;
					btnmusik.setImageResource(R.drawable.musik);
					/* Menghidupkan kembali audio background */
					audio.setVolume(1, 1);
				}

			}
		});

	}

	public void menugone (){
		klik = true;
		btnmusik.setVisibility(View.GONE);
		btnpanduan.setVisibility(View.GONE);
		btntentang.setVisibility(View.GONE);
	}

	public void menuvisible(){
		klik = false;
		btnmusik.setVisibility(View.VISIBLE);
		btnpanduan.setVisibility(View.VISIBLE);
		btntentang.setVisibility(View.VISIBLE);	
	}
	
	 /*public void startanimation() {
	Animation fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
	btnmusik.startAnimation(fade_in);
	btnpanduan.startAnimation(fade_in);
	btntentang.startAnimation(fade_in);

}

	public void stopanimation() {
	Animation fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);
	btnmusik.startAnimation(fade_out);
	btnpanduan.startAnimation(fade_out);
	btntentang.startAnimation(fade_out);
} */
	
	public void onBackPressed() {
		audio.stop();
		finish();
	}
}