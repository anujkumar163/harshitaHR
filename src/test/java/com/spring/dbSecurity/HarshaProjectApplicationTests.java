package com.spring.dbSecurity;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.dbSecurity.entity.Items;
import com.spring.dbSecurity.entity.Orders;
import com.spring.dbSecurity.repository.ProductRepositoryItems;
import com.spring.dbSecurity.repository.ProductRepositoryOrders;

@SpringBootTest
class HarshaProjectApplicationTests {

	@Autowired
	private ProductRepositoryItems itemsrepo;
	
	@Autowired
	private ProductRepositoryOrders ordersrepo;
	
	@Test
	void saveoneItems() {
		Items s1 = new Items();
		s1.setItemsId(1);
		s1.setItemUnitPrice(1000);
		s1.setItemsQuantity(1);
		s1.setItemsName("mobileChip");
		s1.setOrderId(1);
		// to save object s1 to db
		itemsrepo.save(s1);
	}
	

	@Test
	void saveoneOrders() {
		Orders s1 = new Orders();
		s1.setOrderId(1);
		s1.setOrderStatus("pending");
		s1.setTotalItems(1);
		// to save object s1 to db
		ordersrepo.save(s1);
	}
	
	@Test
	//read the itemsByOrderId
	void getoneItemsByOrderId() {
		Optional<Items> findById = itemsrepo.findByOrderId(1L);
		Items s = findById.get();
		System.out.println(s.getItemsId());
		System.out.println(s.getItemsName());
		System.out.println(s.getItemsQuantity());
		System.out.println(s.getItemUnitPrice());
		
		
	}

	
	@Test
	void getAllstudentRecord() {
		Iterable<Items> findAll = itemsrepo.findAll();
		for (Items items : findAll) {
			System.out.println(items.getItemsId());
			System.out.println(items.getItemsName());
			System.out.println(items.getItemsQuantity());
			System.out.println(items.getItemUnitPrice());
		
			
		}
	}
	
	
	
	
	
	

}
