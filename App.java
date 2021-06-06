package com.Bridgelabz.jsonPrograms;

import java.util.List;
import com.Bridgelabz.jsonPrograms.model.*;



/********************
 * 
 * @author ANAND
 *purpose: added Inventory Manager
 *
 ***********************/
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JsonUtility jsonutil =new JsonUtility();
        List<Stock> listStock = jsonutil.convertJsonToObj("F:\\Java\\jsonPrograms\\src\\main\\java\\com\\Bridgelabz\\jsonPrograms\\model\\inventory.json");     
        System.out.println("Total items in the Inventory = " + listStock.size());   
        InventoryManager manager = new InventoryManager();
        manager.readInventory(listStock);
        manager.getTotalRiceWeight();
        manager.getTotalWheatWeight();
        manager.getTotalPulseWeight();
        manager.getPriceOfRicePerKg();
        manager.getPriceOfWheatPerKg();
        manager.getPriceOfPulsesPerKg();
        System.out.println("Total Inventory Cost = " +(manager.getTotalValueOfRice() + manager.getTotalValueOfWheat() + manager.getTotalValueOfPulses()));
    }
}
