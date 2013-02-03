package com.wyr.ideas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class SplashScreenActivity extends Activity {
	private final static int SPLASH_DISPLAY_TIME = 1000;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final ViewGroup rootView = (ViewGroup) getLayoutInflater().inflate(R.layout.splash_screen, null);
		setContentView(rootView); 
		
		AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
		alphaAnimation.setInterpolator(new AccelerateInterpolator());
		alphaAnimation.setDuration(SPLASH_DISPLAY_TIME);
		alphaAnimation.setFillEnabled(true);
		alphaAnimation.setFillAfter(true);
		alphaAnimation.setAnimationListener(new AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {
			}

			@Override
			public void onAnimationEnd(Animation animation) {
	    		rootView.post(new Runnable() {
	    			@Override
	    			public void run() {
		    			Intent intent = new Intent(SplashScreenActivity.this, IdeasListActivity.class);	    		
			    		startActivity(intent);
			    		finish();
	    			}
	    		});
			}

			@Override
			public void onAnimationRepeat(Animation animation) {
			}
			
		});
		rootView.startAnimation(alphaAnimation);
	}	
}