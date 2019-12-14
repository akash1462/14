package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	private static ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();

	public MenuItemDaoCollectionImpl() throws ParseException {
		if (menuItemList.isEmpty()) {

			MenuItem m1 = new MenuItem(1L, "Sandwich", 99.00f, true, DateUtil.convertToDATE("15/03/2017"), "MainCourse",
					true);
			MenuItem m2 = new MenuItem(2L, "Burger", 129.00f, true, DateUtil.convertToDATE("23/12/2017"), "MainCourse",
					false);
			MenuItem m3 = new MenuItem(3L, "Pizza", 149.00f, true, DateUtil.convertToDATE("21/08/2018"), "MainCourse",
					false);
			MenuItem m4 = new MenuItem(4L, "French Fries", 57.00f, false, DateUtil.convertToDATE("02/07/2017"),
					"Starters", true);
			MenuItem m5 = new MenuItem(5L, "Chocolate Brownie", 32.00f, false, DateUtil.convertToDATE("02/11/2022"),
					"Dessert", true);

			menuItemList.add(m1);
			menuItemList.add(m2);
			menuItemList.add(m3);
			menuItemList.add(m4);
			menuItemList.add(m5);

		}
	}

	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	public List<MenuItem> getMenuItemListCustomer() {

		Date today = new Date();

		ArrayList<MenuItem> menuItemListCustomer = new ArrayList<MenuItem>();
		for (MenuItem menuItem : menuItemList) {
			if (menuItem.isActive()
					&& (menuItem.getDateOfLaunch().before(today) || menuItem.getDateOfLaunch().equals(today))) {
				menuItemListCustomer.add(menuItem);

			}
		}

		return menuItemListCustomer;

	}

	public void modifyMenuItem(MenuItem menuItem) {
		int i = 0;
		for (MenuItem m : menuItemList) {
			if (m.equals(menuItem)) {
				break;
			}
			i++;
		}
		menuItemList.set(i, menuItem);
	}

	public MenuItem getMenuItem(long menuItemId) {
		for (MenuItem menu : menuItemList) {
			if (menu.getId() == (menuItemId)) {
				return menu;
			}
		}
		return null;
	}

}
