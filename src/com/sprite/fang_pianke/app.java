package com.sprite.fang_pianke;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.app.Application;

public class app extends Application {
	private List<Activity> activityList=new LinkedList<Activity>();
    private static app instance;
    
    public app(){ 	
    }
    
    public static app getInstance(){
    	if(instance==null){
    		instance=new app();
    	}
    	return instance;
    }
	
    public void addActivity(Activity activity){
    	activityList.add(activity);
    }
    
    public void exit(){
        try {   
            for (Activity activity : activityList) {   
                if (activity != null)   
                    activity.finish();   
            }   
        } catch (Exception e) {   
            e.printStackTrace();   
        } finally {   
            System.exit(0);   
        } 
    }
    
}
