package test;

import java.util.ArrayList;

public abstract class Features {
	
	Treasure a = new Treasure("Boat Toy", "Gold Box");
	Treasure b = new Treasure("Keyboard Toy", "Silver Box");
	// I created an object of the treasure stored and held it in an array below called prizes
	

	ArrayList<Treasure>prizes=new ArrayList <>(); {
	
	
	for (int i=0; i<prizes.size(); i++) {
		System.out.println(prizes.get(i));
	
	}

	
}

}