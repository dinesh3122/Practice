package polymorphism;

public class SmartFinalStore implements GroceryStore{
	
	@Override 
	public void dairy () {
		System.out.println("Milk, Half & Half, Sour Cream, Yougurt, Cheese");
	}
	
	@Override 
	public void spices () {
		System.out.println("Nutmeg, Basil, Red Pepper, Black Pepper, Oregano, Rosemary, Thyme");
	}
	
	@Override
	public void bread () {
		System.out.println("Sourdough, Whole Wheat, White, Gluten Free");
	}
	
	@Override 
	public void drinks () { 
		System.out.println("Coke, Sprite, Apple Cider, Dr. Pepper, Lemonade");
	}
	
	@Override
	public void deli () {
		System.out.println("Ham and Cheese, PBJ, BLT, Meatball Sub, Your Mom");
	}

}
