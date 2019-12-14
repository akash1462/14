package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

@WebServlet("/EditMenuItem")
public class EditMenuItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String id = request.getParameter("id");
			String itemname = request.getParameter("itemname");
			String active = request.getParameter("active");
			String launch = request.getParameter("dateOfLaunch");
			String delivery = request.getParameter("delivery");
			String category = request.getParameter("category");
			long menuId = Long.parseLong(id);

			float cost = Float.parseFloat(request.getParameter("price"));
			
			boolean Stock = ("yes".equals(active)) ? true : false;

			boolean freeDelivery = (delivery != null) ? true : false;
			

			

			MenuItem modifiedMenuItem = new MenuItem(menuId, itemname, cost, Stock, DateUtil.convertToDATE(launch),
					category, freeDelivery);

			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();

			menuItemDao.modifyMenuItem(modifiedMenuItem);

			RequestDispatcher dispatcher = request.getRequestDispatcher("edit-menu-item-status.jsp");
			dispatcher.forward(request, response);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
