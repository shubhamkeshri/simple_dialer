package com.simpledialer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	MediaPlayer song;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		
		song=MediaPlayer.create(Splash.this, R.raw.aaj_unse_pehli);
		song.start();
		Thread splashthread = new Thread() {

			public void run() {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent intent=new Intent("com.simpledialer.Menu");
					startActivity(intent);

				}
			}
		};
		splashthread.start();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		finish();
	}
	
	

}
