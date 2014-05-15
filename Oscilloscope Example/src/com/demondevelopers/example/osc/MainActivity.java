package com.demondevelopers.example.osc;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity
{
	private OscRenderer mRenderer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mRenderer = new OscRenderer();
		
		OscSurfaceView oscSurfaceView = (OscSurfaceView)findViewById(R.id.osc_surface_view);
		oscSurfaceView.setRenderer(mRenderer);
		
		OscView oscView = (OscView)findViewById(R.id.osc_view);
		oscView.setRenderer(mRenderer);

	}
}
