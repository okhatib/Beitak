package yoproduction.beitak.main;

import yoprod.beitak.main.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemsFeedActivity extends Activity {

	yoproduction.beitak.main.CardsLayoutAnimation n;
	ImageView itemImage;
	TextView itemTitle;
	TextView itemDesc;
	TextView itemPrice;
	TextView itemDatePosted;
	TextView itemTimePosted;
	
	static boolean inversed = true;
	static int cardsID = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.items_feed_activity);
	}
	
	public void ClickCardButton(View v) {
		
		Intent i = new Intent(this, ItemDetailsActivity.class);
		startActivity(i);
		
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.items_feed_activity_menu, menu);
		
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		n = (yoproduction.beitak.main.CardsLayoutAnimation)findViewById(R.id.CardsLayout);
		
		switch (item.getItemId()) {
	        case R.id.menu_add_item:
	    		
	    		LayoutInflater inflater = getLayoutInflater();
	    		//ViewGroup parent = null;
	    		View row = inflater.inflate(R.layout.single_item, null);
	    		
	    		//row.setClickable(true);
	    		//row.setOnClickListener(ClickCardButton());
	    		
	    		n.addView(row);
	    		
	    		itemImage = (ImageView)findViewById(R.id.my_item_image);
	    		itemTitle = (TextView)findViewById(R.id.my_item_title);
	    		itemDesc = (TextView)findViewById(R.id.my_item_desc);
	    		itemPrice = (TextView)findViewById(R.id.my_item_price);
	    		itemDatePosted = (TextView)findViewById(R.id.my_item_date_posted);
	    		itemTimePosted = (TextView)findViewById(R.id.my_item_time_posted);
	    		
	    		itemImage.setImageResource(inversed ? R.drawable.ic_launcher : R.drawable.ic_menu_add);
	    		itemTitle.setText(inversed ? "Item Title 1" : "Item Title 2");
	    		itemDesc.setText(inversed ? "Item Description 1" : "Item Description 2");
	    		itemPrice.setText(inversed ? "100 L.E." : "200 L.E.");
	    		itemDatePosted.setText(inversed ? "1/1/2013" : "2/2/2013");
	    		itemTimePosted.setText(inversed ? "13:59:59" : "14:59:59");

	    		itemImage.setId(findId());
	    		itemTitle.setId(findId());
	    		itemDesc.setId(findId());
	    		itemPrice.setId(findId());
	    		itemDatePosted.setId(findId());
	    		itemTimePosted.setId(findId());
	    		
	    		inversed = !inversed;
	    		
	    		return true;
	        case R.id.menu_refresh:
	        	
	        	n.removeAllViews();
	        	
	        	return true;
//	        case R.id.menu_settings:
//	        	return super.onOptionsItemSelected(item);
	    }
		return false;
	}

	// Returns a valid id that isn't in use
	public int findId(){  
	    View v = findViewById(cardsID);  
	    while (v != null){  
	        v = findViewById(++cardsID);  
	    }  
	    return cardsID++;  
	}
}
