package com.cognizant.truyum.dao;

import java.text.ParseException;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {

	public static void main(String[] args) throws Exception {
		MenuItemDaoCollectionImpl m = new MenuItemDaoCollectionImpl();
		m.getMenuItemListAdmin();

		System.out.println("---Menu Items----");
		testGetMenuItemListAdmin();
		System.out.println("---Available Items in stock --");
		testGetMenuItemListCustomer();
		System.out.println("---Modified items ----");
		testModifyMenuItem();

	}

	public static void testGetMenuItemListAdmin() throws Exception {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();

		for (Object menuItem : menuItemDao.getMenuItemListAdmin()) {
			System.out.println(menuItem);
		}
	}

	public static void testGetMenuItemListCustomer() throws Exception {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();

		for (Object menuItem : menuItemDao.getMenuItemListCustomer()) {
			System.out.println(menuItem);

		}
	}

	public static void testModifyMenuItem() throws Exception {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem menuItem1 = new MenuItem(4L, "fries", 30.00F, true, DateUtil.convertToDATE("22/07/2019"), "Snacks",
				false);
		menuItemDao.modifyMenuItem(menuItem1);
		MenuItem menuItem = menuItemDao.getMenuItem(4L);
		System.out.println(menuItem);
	}

}
