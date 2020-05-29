package decoratorANDfacade;

public class Cheese extends IngredientsDecorator{

	public Cheese(Burger newBurger) {
		super(newBurger);
		
		System.out.println("Making new Burger...");
		
		System.out.println("Adding Ingredients");
		
		System.out.println("Adding Cheese and removing Egg");
	}

	public String getDescription() {
		
		return tempBurger.getDescription() + " with Cheese";
	}
	
	public double getCost() {
		
		return tempBurger.getCost()+ .50;
		
	}
}