package junk;

public class junk {
	
	public static void main(String[] args) {
		
		double temperature = 50;

		if (temperature >= 100)
		    System.out.println("too hot");
		else if (temperature <= 40)
		    System.out.println("too cold");
		else
		    System.out.println("just right");
		
		boolean even = false;
		if (even) {
		    System.out.println("It is even!");}

		for (int i = 0; i < 10; i++) 
		    for (int j = 0; j < i; j++) 
		        System.out.println(i * j);
	}

}
