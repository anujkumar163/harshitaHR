package com.spring.dbSecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dbSecurity.entity.Items;
import com.spring.dbSecurity.entity.Orders;
import com.spring.dbSecurity.repository.ProductRepositoryItems;
import com.spring.dbSecurity.repository.ProductRepositoryOrders;

@RestController
public class Products {
	
	@Autowired
	private ProductRepositoryItems itemsrepo;
	
	@Autowired
	private ProductRepositoryOrders ordersrepo;

	@PostMapping
	public void saveItems(@RequestBody Items items) {
		itemsrepo.save(items);
	}
	
	@PostMapping
	public void saveOrders(@RequestBody Orders orders) {
		ordersrepo.save(orders);
	}
	
	@GetMapping("/get/{id}")
	public Items getItemsById(@PathVariable("orderId") long orderId) {
		try {
			Optional<Items> findById = itemsrepo.findById(orderId);
			Items items = findById.get();
			return items;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping
	public List<Items> getLocation(){
		
		List<Items> items = itemsrepo.findAll();
		return items;
	}
	
	
	
	
}
