package decoratorANDfacade;

public class ClassicBurger implements Burger{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Classic Burger";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 4.00;
	}

}
