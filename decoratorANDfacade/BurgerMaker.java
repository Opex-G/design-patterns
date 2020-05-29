package decoratorANDfacade;

public class BurgerMaker {
	
	public static void main(String[] args) {
		         
		//Making Classic Burger
		        
		        Burger classicBurger = (new ClassicBurger());				
		         
				
		        System.out.println("Type: " + classicBurger.getDescription());
		       		         
		
		        System.out.println("Price: " + classicBurger.getCost());
		        
		 //Making Egg Burger
		        
		        Burger eggBurger = new Egg(new ClassicBurger());				
		         
				
		        System.out.println("Type: " + eggBurger.getDescription());		
		         
		
		        System.out.println("Price: " + eggBurger.getCost());
		        
		        
		 //Making Cheese Burger
		        
		        Burger cheeseBurger = new Cheese(new ClassicBurger());
				
		         
		        System.out.println("Type: " + cheeseBurger.getDescription());		
		         
		
		        System.out.println("Price: " + cheeseBurger.getCost());
		
	}

}
