package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.CartDao;
import com.cognizant.truyum.dao.CartDaoCollectionImpl;
import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.model.Cart;

@WebServlet("/RemoveCart")
public class RemoveCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        long id = Long.parseLong(request.getParameter("id"));
        CartDao cartDao = null;
			cartDao = new CartDaoCollectionImpl();
        long userId = 1L;

        cartDao.removeCartItem(userId, id);
        request.setAttribute("removeCartItemStatus", true);
        try {
            Cart cartItem = cartDao.getAllCartItems(userId);
            double total = cartItem.getTotal();
            request.setAttribute("cart", cartItem);
            request.setAttribute("total", total);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
            dispatcher.forward(request, response);

        } catch (CartEmptyException e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("cart-empty.jsp");
            dispatcher.forward(request, response);
        }

    }

}
