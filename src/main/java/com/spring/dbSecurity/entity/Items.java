package com.spring.dbSecurity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items {
	
	@Id
	private long itemsId;
	
	private long orderId;
	
	private String itemsName;
	private long itemUnitPrice;
	private long itemsQuantity;
	
	@ManyToOne
	private Orders orders;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(long itemsId, long orderId, String itemsName, long itemUnitPrice, long itemsQuantity, Orders orders) {
		super();
		this.itemsId = itemsId;
		this.orderId = orderId;
		this.itemsName = itemsName;
		this.itemUnitPrice = itemUnitPrice;
		this.itemsQuantity = itemsQuantity;
		this.orders = orders;
	}

	public long getItemsId() {
		return itemsId;
	}

	public void setItemsId(long itemsId) {
		this.itemsId = itemsId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public long getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(long itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public long getItemsQuantity() {
		return itemsQuantity;
	}

	public void setItemsQuantity(long itemsQuantity) {
		this.itemsQuantity = itemsQuantity;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	
	
	
	
	
	
}
