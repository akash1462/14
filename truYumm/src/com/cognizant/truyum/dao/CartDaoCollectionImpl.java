package com.cognizant.truyum.dao;

import java.util.HashMap;
import com.cognizant.truyum.model.*;
import java.text.ParseException;
import java.util.ArrayList;

public class CartDaoCollectionImpl implements CartDao{
	 
	private static HashMap<Long, Cart> userCarts =new HashMap<Long, Cart>();
	public CartDaoCollectionImpl(){
		ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();
		if (userCarts.isEmpty()){
			Cart cart = new Cart(0, menuItem);
			userCarts.put(1l, cart);
		}
	}

	@Override
	public void addCartItem(long userId, long menuItemId) throws Exception{

		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
		
		if (userCarts.containsKey(userId)) {
			
			Cart cart = userCarts.get(userId);
			ArrayList<MenuItem> menuItemList = cart.getMenuItemList();
			menuItemList.add(menuItem);
			
		} 
		else 
		{
			Cart cart = new Cart(0, new ArrayList<MenuItem>());
			ArrayList<MenuItem> list = cart.getMenuItemList();
			if (!userCarts.containsKey(userId)) {
				list.add(menuItem);
				userCarts.put(userId, cart);
			}
		}
	}

	@Override
	public Cart getAllCartItems(long userId) throws CartEmptyException{
		Cart cart = userCarts.get(userId);
		ArrayList<MenuItem> menuItemList = cart.getMenuItemList();
			if(menuItemList.isEmpty())
			{
				throw new CartEmptyException();
			}
			else{
				float total = 0;
				for(MenuItem menu:menuItemList){
					total += menu.getPrice();
				}
				Cart cart1= new Cart(total,menuItemList);
				return cart1;
			}
		
	}
	
	@Override
	public void removeCartItem(long userId, long menuItemId) throws NullPointerException {
		Cart cart =userCarts.get(userId);
		ArrayList<MenuItem> list =cart.getMenuItemList();
		for(MenuItem menuItem:list) {
			if(menuItem.getId()==menuItemId) {
				list.remove(menuItem);
				break;
			}
		}
	}
	
}
