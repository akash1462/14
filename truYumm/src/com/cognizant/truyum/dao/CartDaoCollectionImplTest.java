package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.ArrayList;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {

	public static void main(String[] args) throws Exception {

		System.out.println("Added item  ");
		testAddCartItem();
		
		System.out.println("Removed item");
		testRemoveCartItem();

	}

	public static void testAddCartItem() throws ParseException, CartEmptyException, Exception {

		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1L, 1L);
		cartDao.addCartItem(1L, 2L);
		cartDao.addCartItem(1L, 3L);
		Cart cart = cartDao.getAllCartItems(1L);

		ArrayList<MenuItem> menuItem = cart.getMenuItemList();
		for (MenuItem menu : menuItem) {
			System.out.println(menu);
		}
		System.out.println(cart);
	}

	public static void testGetAllCartItems() throws ParseException, CartEmptyException {
		CartDao cartDao = new CartDaoCollectionImpl();

		Cart cart = cartDao.getAllCartItems(1L);

		if (cart != null) {
			ArrayList<MenuItem> list = cart.getMenuItemList();

			for (MenuItem menuItem : list) {
				System.out.println(menuItem);
			}
		}
	}

	public static void testRemoveCartItem() throws ParseException, NullPointerException {
		CartDao cartDao = new CartDaoCollectionImpl();

		try {
			cartDao.removeCartItem(1L, 2L);
			cartDao.getAllCartItems(1L);

			testGetAllCartItems();
		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}
}
