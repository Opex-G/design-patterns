package decoratorANDfacade;

	public abstract class IngredientsDecorator implements Burger{
		
		protected Burger tempBurger;
		
		public IngredientsDecorator(Burger newBurger) {
			tempBurger = newBurger;
		}
		
		public String getDescription() {
			
			return tempBurger.getDescription();
		}
		
		
		public double getCost() {
			
			return tempBurger.getCost();
		}
}
