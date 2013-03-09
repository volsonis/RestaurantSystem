package main;

import java.sql.Date;

public class Ingredient
{
	
	private int id;
	private String name;
	private int stock;
	private double price;
	private Date expires;
	
	public Ingredient(int id, String name, int stock, double price, String expires)
	{
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.expires = Date.valueOf(expires);
	}

	

	public Date getExpires()
  {
    return expires;
  }



  public void setExpires(Date expires)
  {
    this.expires = expires;
  }



  public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getStock()
	{
		return stock;
	}

	public void setStock(int stock)
	{
		this.stock = stock;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
}
