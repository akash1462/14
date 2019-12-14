package com.cognizant.truyum.model;

import java.util.ArrayList;

public class Cart {
	private ArrayList<MenuItem> menuItemList=new ArrayList<MenuItem>();
	
	public Cart(double total, ArrayList<MenuItem> menuItemList){
		this.total = total;
		this.menuItemList = menuItemList;
	}
	
	public ArrayList<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(ArrayList<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	private double total;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Total=" + total ;
	}

	 
}
