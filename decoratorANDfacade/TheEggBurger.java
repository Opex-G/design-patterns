package decoratorANDfacade;

public class TheEggBurger {
	
	public static void main(String[] args) {
		
		// The PlainPizza object is sent to the Mozzarella constructor
		
		// and then to the TomatoSauce constructor
		
		         
		
		        Burger basicBurger = new Egg(new ClassicBurger());
		
		         
		
		        System.out.println("Ingredients: " + basicBurger.getDescription());
		
		         
		
		        System.out.println("Price: " + basicBurger.getCost());

		
	}

}
