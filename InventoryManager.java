package com.Bridgelabz.jsonPrograms;

import java.util.List;
import java.util.ArrayList;
import com.Bridgelabz.jsonPrograms.model.*;

/*********
 * 
 * @author ANAND
 * purpose:Adding Inventory Manager
 *
 ********/
public class InventoryManager {
	//List of Items
	private List<Stock> wheat =new ArrayList<Stock>();
	private List<Stock> rice =new ArrayList<Stock>();
	private List<Stock> pulses =new ArrayList<Stock>();
	
	//using read inventory to read all inventory items
	public void readInventory(List<Stock> stockList) {
		
			
		for(Stock stock:stockList) {
			if(stock.getId() == 1001) {
				wheat.add(stock);
			}
			if(stock.getId() == 1002) {
				rice.add(stock);
			}
			if(stock.getId() == 1003) {
				pulses.add(stock);
			}
		}	
	}
	
	
	public double getTotalRiceWeight() {
		double weight = 0;
		for(Stock stock:rice) {
			weight = weight+stock.getWeight();	
			System.out.println("Total Weight of Rice = " + weight + " kgs");
		}
		return weight;
	}
	public double getTotalWheatWeight() {
		double weight = 0;
		for(Stock stock:wheat) {
			weight = weight+stock.getWeight();	
			System.out.println("Total Weight of Wheat = " + weight + " kgs");
		}
		return weight;
	}
	public double getTotalPulseWeight() {
		double weight = 0;
		for(Stock stock:pulses) {
			weight = weight+stock.getWeight();	
			System.out.println("Total Weight of Pulses = " + weight + " kgs");
		}
		return weight;
	}
	
	
	public double getPriceOfRicePerKg() {
		double price = 0;
		for(Stock stock:rice) {
			price = price+stock.getPrice();	
			System.out.println("Price of Rice = " + price + "/kg");
		}
		return price;
	}
	public double getPriceOfWheatPerKg() {
		double price = 0;
		for(Stock stock:wheat) {
			price = price+stock.getPrice();	
			System.out.println("Price of Wheat = " + price + "/kg");
		}
		return price;
	}
	public double getPriceOfPulsesPerKg() {
		double price = 0;
		for(Stock stock:pulses) {
			price = price+stock.getPrice();	
			System.out.println("Price of Pulses = " + price + "/kg");
		}
		return price;
	}
	
	//Total value of each inventory
	public double getTotalValueOfRice() {
		double value = 0;
		for(Stock stock:rice) {
			value = value+stock.getPrice() * stock.getWeight();	
			System.out.println("Total Value of Rice = Rs." + value);
		}
		return value;
	}
	public double getTotalValueOfWheat() {
		double value = 0;
		for(Stock stock:wheat) {
			value = value+stock.getPrice() * stock.getWeight();	
			System.out.println("Total Value of Wheat = Rs." + value);
		}
		return value;
	}
	public double getTotalValueOfPulses() {
		double value = 0;
		for(Stock stock:pulses) {
			value = value+stock.getPrice() * stock.getWeight();	
			System.out.println("Total Value of Pulses = Rs." + value);
		}
		return value;
	}
}
