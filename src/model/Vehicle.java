package model;

import java.util.EnumSet;
import java.util.Set;

public class Vehicle
{
	    private EnumSet<Category> categorySet;
	    
	    /** In pounds */
	    private double costPrice;
	    
	    private String vin;
	    private String regNo;
	    
	    public Vehicle(String vin, String regNo, int cost, Set<Category> categories)
	    {
	    	this.vin = vin;
	    	this.regNo = regNo;
	    	this.costPrice = cost;
	        this.categorySet.addAll(categories);
	    }
	    
	    public String getVin()
	    {
	    	return this.vin;
	    }
	    
	    public String getRegNo()
	    {
	    	return this.regNo;
	    }
	    
	    public double getCostPrice()
	    {
	    	return this.costPrice;
	    }
	    
	    public boolean isCategory(Category category)
	    {
	    	return this.categorySet.contains(category);
	    }
}
