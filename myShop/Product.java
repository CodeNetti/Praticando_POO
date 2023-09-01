package myShop;

public class Product {
	 public String name;
	 public double price;
	 public int quantity;
	 public double total;
	
	
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
