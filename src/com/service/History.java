package com.service;

import java.util.Stack;

import com.pojo.Item;

public class History {
private Stack<Item> history;

public History() {
	history=new Stack<>();
}
public void addHistory(Item item) {
	history.push(item);
}
public void lastPurchase() {
	Item it=history.pop();
	System.out.println("Last purchase is: \n");
	 System.out.println("product:"+it.getItem_name()+"Quantity:"+it.getQuantity()+" price:"+it.getQuantity());
}
public void printHistory() {
    System.out.println("Purchase History:");
    for (Item item : history) {
        System.out.println("Item: " + item.getItem_name() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
    }
}

}
