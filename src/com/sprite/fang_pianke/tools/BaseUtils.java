/**
 *  ����������
 * 
 * @author spyrx7  
 * @link URL https://github.com/spyrx7
 * @time 2015-7-30
 */
package com.sprite.fang_pianke.tools;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class BaseUtils {

	/**
	 * ������ĻWidth
	 * @param context
	 * @return
	 */
	public static int getWindowWidth(Context context) {
         WindowManager manager=(WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
         DisplayMetrics dm=new DisplayMetrics();
         manager.getDefaultDisplay().getMetrics(dm);
		 return dm.widthPixels;
         
	}

	/**
	 * ������Ļheight
	 * @param context
	 * @return
	 */
	public static int getWindowHeight(Context context) {
		WindowManager manager=(WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm=new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
	}

}
