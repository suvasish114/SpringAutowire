package com.example.SpringAutowire;

public class Laptop {
	
	
	private String name;
	private int price;
	private Motherboard motherboard;
	private Processor processor;

	// laptop.class is dependent on mothernoard.class and processoer.class
		// this is example of tight coupling
		// We want to resolve the tight coupling by using spring framework
	
	
	// constructors
	public Laptop() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public void getLaptopDetails() {
		System.out.println("Laptop Name: "+name);
		System.out.println("Laptop price: "+price);
		System.out.println("Motherboard: "+motherboard.getName());
		System.out.println("Processor: "+processor.getName());
	}
}
