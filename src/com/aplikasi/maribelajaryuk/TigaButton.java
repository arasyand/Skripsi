package com.aplikasi.maribelajaryuk;

import java.security.PublicKey;

import com.aplikasi.maribelajaryuk.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TigaButton extends Activity {

	ImageButton btnkeluar, btnlatihanmembaca, btnbelajarmembaca,
			btnbermainmembaca, btnlatihanberhitung, btnbelajarberhitung,
			btnbermainberhitung;
	String id, id1, id2;

	public void onCreate(Bundle savedIntanceState) {
		super.onCreate(savedIntanceState);
		setContentView(R.layout.tigabutton);

		btnkeluar = (ImageButton) findViewById(R.id.btnkeluar);
		btnlatihanmembaca = (ImageButton) findViewById(R.id.btnlatihanmembaca);
		btnbelajarmembaca = (ImageButton) findViewById(R.id.btnbelajarmembaca);
		btnbermainmembaca = (ImageButton) findViewById(R.id.btnbermainmembaca);
		btnlatihanberhitung = (ImageButton) findViewById(R.id.btnlatihanberhitung);
		btnbelajarberhitung = (ImageButton) findViewById(R.id.btnbelajarberhitung);
		btnbermainberhitung = (ImageButton) findViewById(R.id.btnbermainberhitung);

		final MediaPlayer tombol = MediaPlayer.create(this, R.raw.button);

		Intent i = getIntent();
		id = i.getStringExtra("id");
		id1 = i.getStringExtra("id1");
		id2 = i.getStringExtra("id2");

		tampil();

		btnkeluar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tombol.start();
				finish();
			}
		});

		btnbelajarmembaca.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(TigaButton.this, MembacaActivity.class);
				String belajar = "belajar";
				i.putExtra("membaca", belajar);
				startActivity(i);
				tombol.start();
				finish();
			}
		});

		btnbelajarberhitung.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(TigaButton.this, MembacaActivity.class);
				startActivity(i);
				tombol.start();
				finish();
			}
		});

		btnlatihanmembaca.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(TigaButton.this, MembacaActivity.class);
				String latihan = "latihan";
				i.putExtra("membaca1", latihan);
				startActivity(i);
				tombol.start();
				finish();
			}
		});

		btnlatihanberhitung.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(TigaButton.this, MembacaActivity.class);
				startActivity(i);
				tombol.start();
				finish();
			}
		});

		btnbermainmembaca.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(TigaButton.this, MembacaActivity.class);
				startActivity(i);
				tombol.start();
				finish();
			}
		});

		btnbermainberhitung.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(TigaButton.this, MembacaActivity.class);
				startActivity(i);
				tombol.start();
				finish();
			}
		});

	}

	private void tampil() {
		if (id != null) {
			btnbelajarmembaca.setVisibility(View.VISIBLE);
			btnbelajarberhitung.setVisibility(View.VISIBLE);
			btnlatihanmembaca.setVisibility(View.INVISIBLE);
			btnlatihanmembaca.setVisibility(View.INVISIBLE);
			btnbermainmembaca.setVisibility(View.INVISIBLE);
			btnbermainberhitung.setVisibility(View.INVISIBLE);
		}
		if (id1 != null) {
			btnbelajarmembaca.setVisibility(View.INVISIBLE);
			btnbelajarberhitung.setVisibility(View.INVISIBLE);
			btnlatihanmembaca.setVisibility(View.VISIBLE);
			btnlatihanmembaca.setVisibility(View.VISIBLE);
			btnbermainmembaca.setVisibility(View.INVISIBLE);
			btnbermainberhitung.setVisibility(View.INVISIBLE);
		}
		if (id2 != null) {
			btnbelajarmembaca.setVisibility(View.INVISIBLE);
			btnbelajarberhitung.setVisibility(View.INVISIBLE);
			btnlatihanmembaca.setVisibility(View.INVISIBLE);
			btnlatihanmembaca.setVisibility(View.INVISIBLE);
			btnbermainmembaca.setVisibility(View.VISIBLE);
			btnbermainberhitung.setVisibility(View.VISIBLE);
		}

	}
}