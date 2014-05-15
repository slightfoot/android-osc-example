package com.demondevelopers.example.osc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;


public class OscSurfaceView extends SurfaceView
{
	private OscRenderer mRenderer;
	
	
	public OscSurfaceView(Context context)
	{
		super(context);
		initView(context, null);
	}
	
	public OscSurfaceView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		initView(context, attrs);
	}
	
	public OscSurfaceView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		initView(context, attrs);
	}
	
	private void initView(Context context, AttributeSet attrs)
	{
		//
	}
	
	public void setRenderer(OscRenderer renderer)
	{
		mRenderer = renderer;
	}
}
