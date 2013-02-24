package yoproduction.betak.entity;

import java.util.ArrayList;

import android.location.Location;

public class Item {
	protected int itemID;
	protected String title;
	protected String description;
	protected int price;
	protected boolean owned;
	protected Location geoLoaction;
	protected ArrayList<String> tags;
	protected int galleryID;
	protected ItemType type;

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isOwned() {
		return owned;
	}

	public void setOwned(boolean owned) {
		this.owned = owned;
	}

	public Location getGeoLoaction() {
		return geoLoaction;
	}

	public void setGeoLoaction(Location geoLoaction) {
		this.geoLoaction = geoLoaction;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	public int getGalleryID() {
		return galleryID;
	}

	public void setGalleryID(int galleryID) {
		this.galleryID = galleryID;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

}
