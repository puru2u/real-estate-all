package com.zawadz88.realestate;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import com.zawadz88.realestate.model.Section;

/**
 * Created: 11.11.13
 *
 * @author Zawada
 */
public class AdsActivity extends ActionBarActivity {

	public static final String EXTRA_POSITION_TAG = "position";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ads);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle(Section.ADS.getTitleResourceId());

	}
}