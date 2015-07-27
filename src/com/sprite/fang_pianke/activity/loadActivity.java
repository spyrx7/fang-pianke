package com.sprite.fang_pianke.activity;

import com.sprite.fang_pianke.MainActivity;
import com.sprite.fang_pianke.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loadActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.load_activity);
		Thread thread=new Thread(){
			public void run() {
				try {
					Thread.sleep(3000);
					
					Intent intent=new Intent(loadActivity.this, MainActivity.class);
					startActivity(intent);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		};
		thread.start();
	}
	
	Handler handler=new Handler(){
		public void handleMessage(android.os.Message msg) {
			
		};
	};
}
