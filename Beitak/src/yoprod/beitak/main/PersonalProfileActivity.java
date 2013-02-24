package yoprod.beitak.main;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PersonalProfileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_profile_activity);
	}
	
	//hello commit

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.personal_profile_activity, menu);
		return true;
	}

}
