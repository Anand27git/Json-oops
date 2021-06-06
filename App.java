package com.Bridgelabz.jsonPrograms;

import java.util.List;
import com.Bridgelabz.jsonPrograms.model.Stock;

/**********
 * 
 * @author ANAND 
 * purpose :Json Inventory Data Management Using Rice,pulses,wheat
 * Problem Statement 1: prints the total items in the inventory
 *
 *
 *********/
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		JsonUtility jsonutil = new JsonUtility();
		List<Stock> listStock = jsonutil.convertJsonToObj(
				"F:\\Java\\jsonPrograms\\src\\main\\java\\com\\Bridgelabz\\jsonPrograms\\model\\inventory.json");
		System.out.println("Total items in the Inventory = " + listStock.size());
	}
}
