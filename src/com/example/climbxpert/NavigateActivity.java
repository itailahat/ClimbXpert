package com.example.climbxpert;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class NavigateActivity extends Activity 
				implements
				SensorEventListener{

	private SensorManager sensMngr;
	private Sensor magno;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigate);
		
		sensMngr = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		magno = sensMngr.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
		
		
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		sensMngr.registerListener(this, magno, SensorManager.SENSOR_DELAY_NORMAL);
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		sensMngr.unregisterListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.navigate, menu);
		return true;
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
		LoggerTools.LogToast(this, "Accuracy changed for sensor: " + sensor + " to: " + accuracy);
		
	}

	@Override
	public void onSensorChanged(SensorEvent se) {
		// TODO Auto-generated method stub
		
		ImageView img = (ImageView)findViewById(R.id.arrowImage);
		TextView xV = (TextView)findViewById(R.id.xValue);
		TextView yV = (TextView)findViewById(R.id.yValue);
		TextView zV = (TextView)findViewById(R.id.zValue);
		
		
		xV.setText("X:" + se.values[0]);
		yV.setText("Y:" + se.values[1]);
		zV.setText("Z:" + se.values[2]);
		
		double Dangle = Math.atan(se.values[1] / se.values[2]);
		
		
		img.setRotation((float)Dangle);
	}

}
