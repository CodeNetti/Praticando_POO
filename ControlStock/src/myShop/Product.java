package myShop;

public class Product {
	 public String name;
	public double price;
	 public int quantity;
	 public double total;
	 
	 public Product(String name, double price, int quantity) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
	
	
	public double TotalValueinStock() 
	{
	    return  price * quantity;
		
	}
	public void AddProducts(int insertQuantity) 
	{
		this.quantity = this.quantity + insertQuantity;
		
		
	}
	public void RemoveProducts(int insertQuantity) 
	{
		this.quantity = this.quantity - insertQuantity;
	}

}
