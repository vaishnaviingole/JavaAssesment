package com.pojo;

public class Item {
int quantity;
String item_name;
double price;


public Item(int quantity, String item_name, double price) {
	super();
	this.quantity = quantity;
	this.item_name = item_name;
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getItem_name() {
	return item_name;
}
public void setItem_name(String item_name) {
	this.item_name = item_name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
