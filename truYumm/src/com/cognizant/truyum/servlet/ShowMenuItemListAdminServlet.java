package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@WebServlet("/ShowMenuItemListAdmin")
public class ShowMenuItemListAdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ShowMenuItemListAdminServlet() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
    	
    	
        MenuItemDao menuItemDao = null ;
		try {
			menuItemDao = new MenuItemDaoCollectionImpl();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();
        request.setAttribute("menuItemList", menuItemList);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("menu-item-list-admin.jsp");
        dispatcher.forward(request, response);
    }
}
