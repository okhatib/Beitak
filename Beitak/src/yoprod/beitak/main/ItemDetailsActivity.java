package yoprod.beitak.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ItemDetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_details_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.item_details_activity_menu, menu);
		return true;
	}

}
