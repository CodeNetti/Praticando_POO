package myShop;

public class Product {
	 private String name;
	 private double price;
	 private int quantity;

	 public Product() 
	 {
		 
	 }
	 
	 public Product(String name, double price, int quantity) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
	 public Product(String name, double price ) {
			
			this.name = name;
			this.price = price;
			
		}
	 public   void  setName(String name) 
	 {
		 this.name = name;
	 }
	public String getName() 
	{
		return this.name;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public double getPrice() 
	{
		return this.price;
	}

	public int getQuantity() 
	{
		return this.quantity;
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
