package decoratorANDfacade;

public class Egg extends IngredientsDecorator{

	public Egg(Burger newBurger) {
		super(newBurger);
		
		System.out.println("Making new Burger...");
		
		System.out.println("Adding Ingredients");
		
		System.out.println("Adding Egg");
	}

	public String getDescription() {
		
		return tempBurger.getDescription() + " with Egg";
	}
	
	
	public double getCost() {
		
		return tempBurger.getCost()+ .50;
		
	}
}
