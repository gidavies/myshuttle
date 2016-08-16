package com.microsoft.example.models;

import java.util.List;

/**
 * Simple model basically mimicking what's in the database
 * as part of the employees table.
 */
public class Employee
    implements java.io.Serializable
{
	public Employee() { }
	public Employee(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
		// Comment to test CI
	}
	
	public int getID() { return id; }
	
	public String getUsername() { return username; }
	public void setUsername(String value) { username = value; }
	
	public String getPassword() { return password; }
	public void setPassword(String value) { password = value; }
  
  public int getTotalFees(List<Fare> fares) {
    int total = 0;
    
    for (Fare f : fares) {
      total += f.getDriverFee();
    }
    
    return total;
  }
  public float getTotalFeesInDollars(List<Fare> fares) {
    return getTotalFees(fares) / 100.0f;
  }
	
	@Override
	public String toString() {
		return "[Employee " + 
			"id:" + id + " " +
			"username:" + username + " " +
			"password:" + password + " " +
		"]";
	}
	
	private int id;
	private String username;
	private String password;
}