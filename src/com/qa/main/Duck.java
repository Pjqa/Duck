package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck {

	private String name;
	private Boolean isAMallard;
	private int weight;
	private String size;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsAMallard() {
		return isAMallard;
	}
	public void setIsAMallard(Boolean isAMallard) {
		this.isAMallard = isAMallard;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Duck [name=" + name + ", isAMallard=" + isAMallard + ", weight=" + weight + ", size=" + size + "]";
	}
	
	public Duck(String name, boolean isAMallard, int weight, String size) {
		 this.name = name;
		 this.isAMallard = isAMallard;
		 this.weight = weight;
		 this.size = size;
		
	}
	
	public Duck() {
		
	}

	List<Duck> animals = new ArrayList <>();
	
	public void printAllList() {
		
		System.out.println(animals);

	}
	
	public void Mallard() {
		for (Duck d : animals) {
			if (d.getIsAMallard() == true) {
				System.out.println(d);
			}
		} 
		
	}
	public void sortDuck() {
		List<String> ducknames = new ArrayList <> ();
		for (Duck n : animals) {
			ducknames.add(n.getName());
		}
		
		Collections.sort(ducknames);
		System.out.println(ducknames);
	}
}