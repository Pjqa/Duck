package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckManger {

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

