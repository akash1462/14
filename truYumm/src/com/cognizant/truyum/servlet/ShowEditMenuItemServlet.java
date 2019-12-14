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

@WebServlet("/ShowEditMenuItem")
public class ShowEditMenuItemServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ShowEditMenuItemServlet() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int menuItemId = Integer.parseInt(request.getParameter("id"));
        MenuItemDao menuItemDao = null;
		try {
			menuItemDao = new MenuItemDaoCollectionImpl();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String[] category= {"Starters","Main Course","Dessert","Drinks"};
        request.setAttribute("category", category);
        MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
        request.setAttribute("menuItem", menuItem);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit-menu-item.jsp");
        dispatcher.forward(request, response);
    }
}
