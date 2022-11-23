package com.book.demo.comparator;

import java.util.Comparator;

import com.book.demo.entity.Order;

public class SortingBasedOnBookName implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub
		return o2.getBookName().compareTo(o1.getBookName());
	}

}
