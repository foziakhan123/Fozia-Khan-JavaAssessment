package test;


import java.util.Random;
import java.util.Scanner;

public class Runner {
	
	static int playerXLocation;
	static int playerYLocation;
	
	
	

	public static void main (String []args) {
		
		
		System.out.println ("You awaken to find yourself in a barren moor.");
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Try 'Look'");
		System.out.println(scan.next()); 
		
		System.out.println ("Grey foggy clouds float oppressively close to you,\r\n" + 
				"reflected in the murky grey water which reaches up your\r\n" + 
				"shins.");
		System.out.println ("Some black plants barely poke out of the shallow water.");
		
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Try 'north', 'south', 'east', 'west'");

		Scanner dir = new Scanner(System.in); 
		String direction = dir.nextLine(); 
		
		
		
		if(direction.equalsIgnoreCase("North"))  
		{ 
			playerXLocation--; 
			System.out.println("Move North."); 
		} 
			
		else if(direction.equalsIgnoreCase("Move East"))  
		{ 
			
			playerYLocation++; 
		System.out.println("Move East."); 
		} 
		else if(direction.equalsIgnoreCase(" Move South"))  
		{ 
			
			playerXLocation++; 
			System.out.println("Move South."); 
		} 
		
		else if(direction.equalsIgnoreCase("Move West"))  
			{ 
			
			playerYLocation--; 
			System.out.println("Move West."); 
		} 
		else 
			
		{ 
			System.out.println("Please input an specific direction"); 
		} 

		
		// these IF statments tells the player what position to move 
		
		
		
		
		
		
		}
	
			
		
	}


