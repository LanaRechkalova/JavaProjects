package Class4_Jan8;

public class nested_IF_DrinkSelection {

	public static void main(String[] args) {
int typeSelection = 2;
int drinkSelection = 2;
double price = 0;
String drink = "none";

if (typeSelection == 1){
	System.out.println("Hot drinks: 1 - Tea. 2 - Coffee");
	if (drinkSelection == 1) {
		price = 2.0;
		drink = "tea";
	}else if(drinkSelection == 2) {
		price = 4.0;
		drink = "coffee";
	}else {
		System.out.println("Invalid hot drink selection");
	}
}else if (typeSelection == 2){
		System.out.println("Cold drinks: 1 - Coke. 2 - Sprite");
		if (drinkSelection == 1) {
			price = 1.75;
			drink = "Coke";
		}else if(drinkSelection == 2) {
			price = 2.5;
			drink = "Sprite";
		}else {
			System.out.println("Invalid cold drink selection!");
		}
	}else {
			System.out.println("WTF_Invalid drink type selection.");
		}
	
	if (drink.equals("none"))
		System.out.println("Please try again.");
		else 
			System.out.println("Your total for "  + drink + " is $" + price);
	}}






