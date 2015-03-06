package com.miui.video.widget.bg;

import com.miui.video.R;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class OnlineBg extends FrameLayout {

	private Context context;
	
	private ImageView backgroundImage;
	private ImageView maskImage;
	
	public OnlineBg(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
		init();
	}

	public OnlineBg(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		init();
	}

	public OnlineBg(Context context) {
		super(context);
		this.context = context;
		init();
	}
	
	//init
	private void init() {
		backgroundImage = new ImageView(context);
		backgroundImage.setBackgroundResource(R.drawable.full_bg_online);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		addView(backgroundImage, params);
		
		maskImage = new ImageView(context);
		maskImage.setImageResource(R.drawable.full_bg_mask);
		GradientDrawable d = (GradientDrawable) maskImage.getDrawable();
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        d.setGradientRadius(Math.max(metrics.heightPixels, metrics.widthPixels));
		addView(maskImage, params);
	}
}
