package lab1;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		System.out.println();
	}
}
// -----------------------------------------------------------
class Product{
	String name;
	private int id;
	double price;
	private static int counter = 1;
	
	Product(String name, double price){
		this.name = name;
		this.price = price;
		this.id = counter++;
	}
	@Override
	public String toString() {
		return ("Name:" + this.name + " id:" + this.id);
	}
}

interface Discountable{
	double getDiscountedPrice(int customerID);
}

class OfferProduct extends Product implements Discountable
{
	OfferProduct(String name, double price) {
		super(name, price);
	}

	public double getDiscountedPrice(int customerID) {
		return this.price* 0.9;
	}
}


class Warehouse{
	HashMap<Integer, Product> map = new HashMap<>(); 
	
	int getStockLevel(Product product) {
		return 1;
	}
	
	void reduceStockLevel(Product product, int amount) {
		
	}
}
class Store{
	List<Product> products = new ArrayList<>();
	void addProduct(Product product) {
		products.add(product);
	}

	void removeProductById(int id)
	{
		products.remove(id);
	}

	void displayProducts(){
		for(var product : products) {
			System.out.println(products);
		}
	}
	List<Product> getProductsByPriceRange(double minPrice, double maxPrice){
		return null;
	}

	List<Product> searchProducts(String key){
		return null;
	}
	
	void buy(Customer customer, Product product, int quantity) {
		
	}

}

class Customer{
	String name, city;
	Customer(String name, String city){
		this.name = name;
		this.city = city;
	}
}

class Shoppingbasket{
	HashMap<Integer, Product> map = new HashMap<>(); 
	Customer customer;
	
	Shoppingbasket(Customer customer){
		
	}
	
	double getTotalPrice() {
		return 10;
	}
	void add(Product product, int quantity) {
		
	}
	
	void pay() {
		
	}
	void ship() {
		
	}
	
	void notifyCustomer()
	{
		
	}
}


