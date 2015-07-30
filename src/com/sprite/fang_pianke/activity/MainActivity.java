package com.sprite.fang_pianke.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.sprite.fang_pianke.R;
import com.sprite.fang_pianke.app;
import com.sprite.fang_pianke.tools.BaseUtils;

public class MainActivity extends Activity {
    SlidingMenu slidingmenu;
    private int isBack=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMenu();
    }


    private void initMenu() {
    	slidingmenu=new SlidingMenu(this);
    	slidingmenu.setMode(SlidingMenu.LEFT);
        slidingmenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingmenu.setBehindWidth((int) ((BaseUtils.getWindowWidth(this))*0.4));
        slidingmenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        slidingmenu.setBackgroundColor(Color.parseColor("#757575"));
        slidingmenu.setFadeDegree(0.35f);
        slidingmenu.setMenu(R.layout.main_menu);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_BACK){
			if(isBack==0){
			  Toast toast=Toast.makeText(MainActivity.this, "再按一次，将退出", Toast.LENGTH_LONG);
			  toast.setGravity(Gravity.CENTER, 0,0 );
			  toast.show();
			  isBack++;
			}else{
				app.getInstance().exit();
			}
			
			
		}
		return false;
	}
    
}
