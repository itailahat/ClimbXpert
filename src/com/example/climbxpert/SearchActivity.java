package com.example.climbxpert;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SearchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		/*MapView mapView = (MapView) findViewById(R.id.mapview);
	    mapView.setBuiltInZoomControls(true);
	    
	    
	    double lat = 22.286595;
	    double lng = 70.795685;

	    MapController mc = mapView.getController();

	    GeoPoint defaultPoint = new GeoPoint(
	        (int) (lat * 1E6), 
	        (int) (lng * 1E6));

	    mc.animateTo(defaultPoint);
	    mc.setZoom(13);*/
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

/*	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}*/

}
