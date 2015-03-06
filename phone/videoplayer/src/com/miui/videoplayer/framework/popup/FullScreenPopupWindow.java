package com.miui.videoplayer.framework.popup;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

import com.miui.video.R;

public class FullScreenPopupWindow extends ManagedPopupWindow {
	private int mBackgroundAlpha;

	public FullScreenPopupWindow(Context context) {
		super(LayoutInflater.from(context).inflate(R.layout.vp_popup_fullscreen, null), LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
	
		this.setAnimationStyle(R.style.full_screen_pause_popup_anim_style);
	}
	
	public void setBackgroundAlpha(int backgroundAlpha) {
		this.mBackgroundAlpha = backgroundAlpha;
	}
	
	public void show(View anchor) {
		getContentView().getBackground().setAlpha(mBackgroundAlpha);
		showAtLocation(anchor, Gravity.TOP, 0, 0);
	}
	
}
