package com.book.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.book.demo.entity.Order;
import com.book.demo.repository.OrderRepository;

@SpringBootTest

class OrderServiceImplTest {
	
	@Mock
	OrderRepository orderRepository;
	
	@InjectMocks
	OrderServiceImpl orderService;

	@Test
	@DisplayName("Test - to verify the insert operation")
	//@Disabled
	void testInsertOrder() throws Exception {
		// given
				Order sampleInput = new Order(2,"sai","horrer","20-9-2022","covered");
				Order expectedOutput = new Order(2,"sai","horrer","20-9-2022","covered");
				//Object obj = new Object();
				BDDMockito.given(orderService.insertOrder(sampleInput)).willReturn(expectedOutput);
				
				// when 
				Order actualOutput = orderService.insertOrder(sampleInput);
				
				// verify 
				assertEquals(expectedOutput, actualOutput);
	}

	@Test
	@Disabled
	void testGetAllOrders() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testUpdateOrderById() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDeleteOrderById() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetOrderByBookName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetOrderByOrderDate() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetOrderByOrderStatus() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetOrderBetweenIds() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSortOrderByUserName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	
	void testSortOrderByBookName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetOrderByUserName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSortOrderByOrderDate() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled

	
	void testGetOrderByOrderId() {
		fail("Not yet implemented");
		
		
	
	}

}
