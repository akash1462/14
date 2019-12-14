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

@WebServlet("/ShowCart")
public class ShowCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ShowCartServlet() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long userId = 1L;
        
        try {
            CartDao cart = new CartDaoCollectionImpl();
            request.setAttribute("cart", cart.getAllCartItems(userId));
            RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
            dispatcher.forward(request, response);

        } catch (CartEmptyException e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("cart-empty.jsp");
            dispatcher.forward(request, response);
        }

    }

}
