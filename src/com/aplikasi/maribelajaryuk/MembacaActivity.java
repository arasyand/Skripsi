package com.aplikasi.maribelajaryuk;

import com.aplikasi.maribelajaryuk.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MembacaActivity extends Activity {
	
	String membaca, membaca1, id;

	public void onCreate(Bundle savedIntanceState) {
		super.onCreate(savedIntanceState);
		setContentView(R.layout.membaca);
		
		ImageButton btnhewanbelajar = (ImageButton) findViewById(R.id.btnhewanbelajar);
		ImageButton btnhewanlatihan = (ImageButton) findViewById(R.id.btnhewanlatihan);
		ImageButton btnbuahbelajar = (ImageButton) findViewById(R.id.btnbuahbelajar);
		ImageButton btnbuahlatihan = (ImageButton) findViewById(R.id.btnbuahlatihan);
		ImageButton btnsayuranbelajar = (ImageButton) findViewById(R.id.btnsayuranbelajar);
		ImageButton btnsayuranlatihan = (ImageButton) findViewById(R.id.btnsayuranlatihan);
		ImageButton btnbentukbelajar = (ImageButton) findViewById(R.id.btnbentukbelajar);
		ImageButton btnbentuklatihan = (ImageButton) findViewById(R.id.btnbentuklatihan);
		ImageButton btnwarnabelajar = (ImageButton) findViewById(R.id.btnwarnabelajar);
		ImageButton btnwarnalatihan = (ImageButton) findViewById(R.id.btnwarnalatihan);
		ImageButton btnkendaraanlatihan = (ImageButton) findViewById(R.id.btnkendaraanlatihan);
		ImageButton btnkendaraanbelajar = (ImageButton) findViewById(R.id.btnkendaraanbelajar);
		ImageButton btntubuhlatihan = (ImageButton) findViewById(R.id.btntubuhlatihan);
		ImageButton btntubuhbelajar = (ImageButton) findViewById(R.id.btntubuhbelajar);
		ImageButton btnperasaanlatihan = (ImageButton) findViewById(R.id.btnperasaanlatihan);
		ImageButton btnperasaanbelajar = (ImageButton) findViewById(R.id.btnperasaanbelajar);
		ImageButton btnprofesilatihan = (ImageButton) findViewById(R.id.btnprofesilatihan);
		ImageButton btnprofesibelajar = (ImageButton) findViewById(R.id.btnprofesibelajar);
		ImageButton btnperhiasanlatihan = (ImageButton) findViewById(R.id.btnperhiasanlatihan);
		ImageButton btnperhiasanbelajar = (ImageButton) findViewById(R.id.btnperhiasanbelajar);
		ImageButton btnkeluar = (ImageButton) findViewById(R.id.btnkeluar);
		
		Intent i = getIntent();
		membaca = i.getStringExtra("membaca");
		membaca1 = i.getStringExtra("membaca1");
		
		final MediaPlayer tombol = MediaPlayer.create(this, R.raw.button);
		
		if (membaca!=null) {
			btnhewanbelajar.setVisibility(View.VISIBLE);
			btnbuahbelajar.setVisibility(View.VISIBLE);
			btnbentukbelajar.setVisibility(View.VISIBLE);
			btnprofesibelajar.setVisibility(View.VISIBLE);
			btnwarnabelajar.setVisibility(View.VISIBLE);
			btnperhiasanbelajar.setVisibility(View.VISIBLE);
			btnperasaanbelajar.setVisibility(View.VISIBLE);
			btnkendaraanbelajar.setVisibility(View.VISIBLE);
			btnsayuranbelajar.setVisibility(View.VISIBLE);
			btntubuhbelajar.setVisibility(View.VISIBLE);
			
			btnhewanlatihan.setVisibility(View.INVISIBLE);
			btnbuahlatihan.setVisibility(View.INVISIBLE);
			btnbentuklatihan.setVisibility(View.INVISIBLE);
			btnprofesilatihan.setVisibility(View.INVISIBLE);
			btnwarnalatihan.setVisibility(View.INVISIBLE);
			btnperhiasanlatihan.setVisibility(View.INVISIBLE);
			btnperasaanlatihan.setVisibility(View.INVISIBLE);
			btnkendaraanlatihan.setVisibility(View.INVISIBLE);
			btnsayuranlatihan.setVisibility(View.INVISIBLE);
			btntubuhlatihan.setVisibility(View.INVISIBLE);
		}
		if (membaca1!=null) {
			btnhewanbelajar.setVisibility(View.INVISIBLE);
			btnbuahbelajar.setVisibility(View.INVISIBLE);
			btnbentukbelajar.setVisibility(View.INVISIBLE);
			btnprofesibelajar.setVisibility(View.INVISIBLE);
			btnwarnabelajar.setVisibility(View.INVISIBLE);
			btnperhiasanbelajar.setVisibility(View.INVISIBLE);
			btnperasaanbelajar.setVisibility(View.INVISIBLE);
			btnkendaraanbelajar.setVisibility(View.INVISIBLE);
			btnsayuranbelajar.setVisibility(View.INVISIBLE);
			btntubuhbelajar.setVisibility(View.INVISIBLE);
			
			btnhewanlatihan.setVisibility(View.VISIBLE);
			btnbuahlatihan.setVisibility(View.VISIBLE);
			btnbentuklatihan.setVisibility(View.VISIBLE);
			btnprofesilatihan.setVisibility(View.VISIBLE);
			btnwarnalatihan.setVisibility(View.VISIBLE);
			btnperhiasanlatihan.setVisibility(View.VISIBLE);
			btnperasaanlatihan.setVisibility(View.VISIBLE);
			btnkendaraanlatihan.setVisibility(View.VISIBLE);
			btnsayuranlatihan.setVisibility(View.VISIBLE);
			btntubuhlatihan.setVisibility(View.VISIBLE);
		}
	
	
		btnhewanlatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("hewan", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnbuahlatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("buah", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnsayuranlatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnbentuklatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnwarnalatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnkendaraanlatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btntubuhlatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnperasaanlatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnprofesilatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnperhiasanlatihan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, PenampilLatihanMembaca.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
		btnkeluar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MembacaActivity.this, TigaButton.class);
				id = "arasy";
				i.putExtra("id", id);
				startActivity(i);
				tombol.start();
				finish();
			}
		});
	}

		
	
}
