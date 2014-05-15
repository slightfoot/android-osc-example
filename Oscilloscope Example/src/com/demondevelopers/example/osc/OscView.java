package com.demondevelopers.example.osc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;


public class OscView extends View
{
	private OscRenderer mRenderer;
	
	
	public OscView(Context context)
	{
		super(context);
		initView(context, null);
	}
	
	public OscView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		initView(context, attrs);
	}
	
	public OscView(Context context, AttributeSet attrs, int defStyle)
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
