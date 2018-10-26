package fysik_uppgift;

public class metoder {


	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(0));
		System.out.println(kelvinToCelsius(500));
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
	return fahrenheit-17.2222;	
	}
	public static double kelvinToCelsius(double kelvin){
		return kelvin-273.15;	
	}

	
	

}
