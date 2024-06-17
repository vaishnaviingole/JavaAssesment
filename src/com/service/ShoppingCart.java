package com.service;

import java.util.LinkedList;
import java.util.List;

import com.pojo.Item;

public class ShoppingCart {
 LinkedList <Item> cart;
 
 public ShoppingCart() {
	 cart=new LinkedList<>();
 }
 
 public void addItem(Item item) {
	 cart.add(item);
	 System.out.println("Item added successfully !");
	 
 }
 
 public void printCart() {
	 
	 for(Item item:cart) {
		 System.out.println("product:"+item.getItem_name()+"Quantity:"+item.getQuantity()+" price:"+item.getQuantity());
	 }
	
 }
 
 public void removeItem(String item_name) {
	 for(Item it:cart) {
		 if(it.getItem_name().equals(item_name)) {
			 if(it.getQuantity()>1) {
				 it.setQuantity(it.getQuantity()-1);
			 }
			 else {
				 cart.remove(it);
			 }
			 break;
		 }
	 }
 }
}
