package me.aaditri.clickablepointsonimages;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ClickablePointsOnImages extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clickable_points_on_images);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.clickable_points_on_images, menu);
		return true;
	}

}
