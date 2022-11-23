package com.book.demo.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.book.demo.dto.OrderDefaultResponseDTO;
import com.book.demo.entity.Order;

@Component
@Scope("singleton")

public class OrderDTOConvertor {

	public static OrderDefaultResponseDTO  getOrderDefaultDTO(Order order)
	{
		OrderDefaultResponseDTO dto = new OrderDefaultResponseDTO(
				order.getBookName(),
				order.getUserName(),
				order.getOrderDate());
		return dto;
 
                
	}
}
