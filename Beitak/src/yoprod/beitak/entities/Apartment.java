package yoproduction.betak.entity;

import java.util.ArrayList;

public class Apartment extends Item {
	protected int apartmentID;
	protected ArrayList<Room> rooms;
	protected int surfaceArea;

	// TODO: Need to validate the location of installment related
	// you will pay [installementPerPeriod] 100$ every [installmentPeriod]3
	// months for [installmentEndPeriod] 5 years
	private int installementPerPeriod;
	private int installmentPeriod; // period between every installment
	private int installmentEndPeriod; // total period of installments

	public int getApartmentID() {
		return apartmentID;
	}

	public void setApartmentID(int apartmentID) {
		this.apartmentID = apartmentID;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public int getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

}
