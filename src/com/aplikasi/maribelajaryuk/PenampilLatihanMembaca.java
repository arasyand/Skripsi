package com.aplikasi.maribelajaryuk;

import com.aplikasi.maribelajaryuk.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class PenampilLatihanMembaca extends Activity implements OnClickListener {

	LinearLayout gambar;
	MediaPlayer tombol;
	int count = 0;
	String lathewan, latbuah;

	int hewan[] = { R.drawable.hewtulanjing, R.drawable.hewgamanjing,
			R.drawable.hewtulelang, R.drawable.hewgamelang,
			R.drawable.hewtulgajah, R.drawable.hewgamgajah,
			R.drawable.hewtuljerapah, R.drawable.hewgamjerapah,
			R.drawable.hewtulkambing, R.drawable.hewgamkambing,
			R.drawable.hewtulkelinci, R.drawable.hewgamkelinci,
			R.drawable.hewtulkoala, R.drawable.hewgamkoala,
			R.drawable.hewtulkucing, R.drawable.hewgamkucing,
			R.drawable.hewtulkuda, R.drawable.hewgamkuda,
			R.drawable.hewtulmonyet, R.drawable.hewgammonyet,
			R.drawable.hewtulsapi, R.drawable.hewgamsapi,
			R.drawable.hewtulsemut, R.drawable.hewgamsemut };
	
	int buah[] = { R.drawable.buhtulalpukat, R.drawable.buhgamalpukat,
			R.drawable.buhtulanggur, R.drawable.buhgamanggur,
			R.drawable.buhtulapel, R.drawable.buhgamapel,
			R.drawable.buhtuldurian, R.drawable.buhgamdurian,
			R.drawable.buhtuljambu, R.drawable.buhgamjambu,
			R.drawable.buhtuljeruk, R.drawable.buhgamjeruk,
			R.drawable.buhtulnaga, R.drawable.buhgamnaga,
			R.drawable.buhtulnanas, R.drawable.buhgamnanas,
			R.drawable.buhtulpir, R.drawable.buhgampir,
			R.drawable.buhtulpisang, R.drawable.buhgampisang,
			R.drawable.buhtulsemangka, R.drawable.buhgamsemangka };

	int soundhew[] = { R.raw.hewanjing, R.raw.hewelang, R.raw.hewgajah,
			R.raw.hewjerapah, R.raw.hewkambing, R.raw.hewkelinci,
			R.raw.hewkoala, R.raw.hewkucing, R.raw.hewkuda, R.raw.hewmonyet,
			R.raw.hewsapi, R.raw.hewsemut };
	
	int soundbuh[] = { R.raw.buahalpukat, R.raw.buahanggur, R.raw.buahapel,
			R.raw.buahdurian, R.raw.buahjambu, R.raw.buahjeruk, R.raw.buahnaga,
			R.raw.buahnanas, R.raw.buahpir, R.raw.buahpisang,
			R.raw.buahsemangka };

	protected void onCreate(Bundle savedIntanceState) {
		super.onCreate(savedIntanceState);
		setContentView(R.layout.penampillatihanmembaca);

		ImageButton suarahew = (ImageButton) findViewById(R.id.btnsoundhew);
		ImageButton suarabuah = (ImageButton) findViewById(R.id.btnsoundbuah);
		ImageButton kirihew = (ImageButton) findViewById(R.id.panahkirihew);
		ImageButton kiribuah = (ImageButton) findViewById(R.id.panahkiribuah);
		ImageButton kananhew = (ImageButton) findViewById(R.id.panahkananhew);
		ImageButton kananbuah = (ImageButton) findViewById(R.id.panahkananbuah);

		gambar = (LinearLayout) findViewById(R.id.lingambar);

		kirihew.setOnClickListener(this);
		kananhew.setOnClickListener(this);
		suarahew.setOnClickListener(this);
		kiribuah.setOnClickListener(this);
		kananbuah.setOnClickListener(this);
		suarabuah.setOnClickListener(this);

		Intent i = getIntent();
		lathewan = i.getStringExtra("hewan");
		latbuah = i.getStringExtra("buah");

		if (lathewan != null) {
			kirihew.setVisibility(View.VISIBLE);
			kananhew.setVisibility(View.VISIBLE);
			suarahew.setVisibility(View.VISIBLE);
			kiribuah.setVisibility(View.INVISIBLE);
			kananbuah.setVisibility(View.INVISIBLE);
			suarabuah.setVisibility(View.INVISIBLE);
			gambar.setBackgroundResource(hewan[0]);
		}
		if (latbuah != null) {
			kirihew.setVisibility(View.INVISIBLE);
			kananhew.setVisibility(View.INVISIBLE);
			suarahew.setVisibility(View.INVISIBLE);
			kiribuah.setVisibility(View.VISIBLE);
			kananbuah.setVisibility(View.VISIBLE);
			suarabuah.setVisibility(View.VISIBLE);
			gambar.setBackgroundResource(buah[0]);
		}

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.panahkananhew:
			if (count == 23) {
				count = 0;
				gambar.setBackgroundResource(hewan[count]);

			} else {
				count = count + 1;
				gambar.setBackgroundResource(hewan[count]);

			}
			break;
		case R.id.panahkirihew:
			if (count == 0) {
				count = 23;
				gambar.setBackgroundResource(hewan[count]);

			} else {
				count = count - 1;
				gambar.setBackgroundResource(hewan[count]);

			}
			break;
		case R.id.btnsoundhew:
			if ((count == 0) || (count == 1)) {
				tombol = MediaPlayer.create(this, soundhew[0]);
				tombol.start();
			} else if ((count == 2) || (count == 3)) {
				tombol = MediaPlayer.create(this, soundhew[1]);
				tombol.start();
			} else if ((count == 4) || (count == 5)) {
				tombol = MediaPlayer.create(this, soundhew[2]);
				tombol.start();
			} else if ((count == 6) || (count == 7)) {
				tombol = MediaPlayer.create(this, soundhew[3]);
				tombol.start();
			} else if ((count == 8) || (count == 9)) {
				tombol = MediaPlayer.create(this, soundhew[4]);
				tombol.start();
			} else if ((count == 10) || (count == 11)) {
				tombol = MediaPlayer.create(this, soundhew[5]);
				tombol.start();
			} else if ((count == 12) || (count == 13)) {
				tombol = MediaPlayer.create(this, soundhew[6]);
				tombol.start();
			} else if ((count == 14) || (count == 15)) {
				tombol = MediaPlayer.create(this, soundhew[7]);
				tombol.start();
			} else if ((count == 16) || (count == 17)) {
				tombol = MediaPlayer.create(this, soundhew[8]);
				tombol.start();
			} else if ((count == 18) || (count == 19)) {
				tombol = MediaPlayer.create(this, soundhew[9]);
				tombol.start();
			} else if ((count == 20) || (count == 21)) {
				tombol = MediaPlayer.create(this, soundhew[10]);
				tombol.start();
			} else if ((count == 22) || (count == 23)) {
				tombol = MediaPlayer.create(this, soundhew[11]);
				tombol.start();
			}
			break;
		case R.id.panahkananbuah:
			if (count == 21) {
				count = 0;
				gambar.setBackgroundResource(buah[count]);

			} else {
				count = count + 1;
				gambar.setBackgroundResource(buah[count]);

			}
			break;
		case R.id.panahkiribuah:
			if (count == 0) {
				count = 21;
				gambar.setBackgroundResource(buah[count]);

			} else {
				count = count - 1;
				gambar.setBackgroundResource(buah[count]);

			}
			break;
		case R.id.btnsoundbuah:
			if ((count == 0) || (count == 1)) {
				tombol = MediaPlayer.create(this, soundbuh[0]);
				tombol.start();
			} else if ((count == 2) || (count == 3)) {
				tombol = MediaPlayer.create(this, soundbuh[1]);
				tombol.start();
			} else if ((count == 4) || (count == 5)) {
				tombol = MediaPlayer.create(this, soundbuh[2]);
				tombol.start();
			} else if ((count == 6) || (count == 7)) {
				tombol = MediaPlayer.create(this, soundbuh[3]);
				tombol.start();
			} else if ((count == 8) || (count == 9)) {
				tombol = MediaPlayer.create(this, soundbuh[4]);
				tombol.start();
			} else if ((count == 10) || (count == 11)) {
				tombol = MediaPlayer.create(this, soundbuh[5]);
				tombol.start();
			} else if ((count == 12) || (count == 13)) {
				tombol = MediaPlayer.create(this, soundbuh[6]);
				tombol.start();
			} else if ((count == 14) || (count == 15)) {
				tombol = MediaPlayer.create(this, soundbuh[7]);
				tombol.start();
			} else if ((count == 16) || (count == 17)) {
				tombol = MediaPlayer.create(this, soundbuh[8]);
				tombol.start();
			} else if ((count == 18) || (count == 19)) {
				tombol = MediaPlayer.create(this, soundbuh[9]);
				tombol.start();
			} else if ((count == 20) || (count == 21)) {
				tombol = MediaPlayer.create(this, soundbuh[10]);
				tombol.start();
			}
			break;
		default:
			break;
		}

	}
}
