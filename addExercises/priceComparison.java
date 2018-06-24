package addExercises;

public class priceComparison {
	public static void main(String[] args) {
		   
		   //Declare and define the variable
		   String ourStore = "Our Store";
		   String comp1name= "Best Buy";
		   String comp2name = "Amazon";
		   double ourprice = 499;
		   double comp1price = 579;
		   double comp2price = 529;
		   double comp1sav = 0;
		   double comp2sav = 0;
		   
		   //Savings computation
		   comp1sav = comp1price - ourprice;
		   comp2sav = comp2price - ourprice;
		   
		   		   
		  		   
		   System.out.println("Comparing Prices for Laptop");
		   System.out.println(ourStore + ": " + "$" + ourprice);
		   
		   
		   System.out.println(comp1name + ": " + "$" + comp1price);
		   System.out.println("*Save $" + comp1sav);
		   System.out.println(comp2name + ": " + "$" + comp2price);
		   System.out.println("*Save $" + comp2sav);
		   
		   
		   
	   }
}
