package com.Bridgelabz.jsonPrograms.model;

public class Stock {

	private long id;
	private String name;
	private int weight;
	private double price;

	public Stock(int id, String name, int weight, double price) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	//constructor
	public Stock() {

	}
	//getter and setter Methods
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
