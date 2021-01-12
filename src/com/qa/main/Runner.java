package com.qa.main;

public class Runner {

	public static void main(String[] args) {
	
	
	    Duck dk1 = new Duck ("Red", true, 100, "Mid");
		Duck dk2 = new Duck ("Blue", false, 200, "large");
		Duck dk3 = new Duck ("Black", true, 80, "Mid");
		Duck dk4 = new Duck ("White", false,20, "Small");
		
		//System.out.println(dk1.toString());
		
		Duck dk = new Duck ();
		
		dk.animals.add(dk1);
		dk.animals.add(dk2);
		dk.animals.add(dk3);
		dk.animals.add(dk4);
	      System.out.println(dk.animals);
			
			dk.printAllList();
			
			dk.Mallard();
			
			dk.sortDuck();
	}

}
