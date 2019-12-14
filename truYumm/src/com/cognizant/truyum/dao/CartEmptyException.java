package com.cognizant.truyum.dao;

import java.io.PrintWriter;

public class CartEmptyException extends Exception {

	CartEmptyException() {
		System.out.println("Cart is empty");
		

	}

}
