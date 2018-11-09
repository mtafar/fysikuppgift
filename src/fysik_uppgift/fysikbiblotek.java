package fysik_uppgift;

public class fysikbiblotek {
	static double G = 9.82;
	public static void main(String[] args) {
		System.out.println(volumeToMass(SolidTable.IRON,0.008) + "kg");
		System.out.println(svtDistance(2.8, 60) *60);
		System.out.println(fluids.WATER, 5,1);
		System.out.println(fluidPressure(fluids.WATER, 100));
		System.out.println(velocityToHeight(50/3.6)+ 1.8);
		double velocity = 100/3.6;
		double acceleration = velocity/4.4;
		double force = acceleration * 740;
		double distance = svtDistance(100/3.6,4.4);
		double work = work(force,distance);
		System.out.println(power(work,4.4));
		double hopp = 0;
		for (double i = 10; i > 0.5;) {
			i = enum.velocityToHeight(enum.fallSpeed(i)) - (i/100);
				hopp++;}
	System.out.println( pressureUnderWater(155));
	System.out.println(kelvinToCelsius(2000)+ "c");
	System.out.println(fallSpeed(800));
	}
	/**
	 * en metod som �ndrar farenheit till celsius
	 * @param fahrenheit
	 * @return
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
	return fahrenheit-17.2222;	
	}
	/**
	 * en metod som �ndrar kelvin till celsius
	 * @param kelvin
	 * @return
	 */
	public static double kelvinToCelsius(double kelvin){
		return kelvin-273.15;	
	}
	/**
	 * en metod som m�ter hur mycket tryck en viss v�tska har
	 * @param fluid
	 * @param deep
	 * @return
	 */
	public static double fluidPressure(fluids fluid, double deep) {
		double p = fluid.density * deep * G;
		return p;
	}
	/**
	 * en metod som m�ter hur mycket tryck vatten har vid ett visst djup
	 * @param deep
	 * @return
	 */
	public static double pressureUnderWater(double deep) {
		double w = fluids.H20.density * deep * G;
		return w;
	}
	/**
	 * en metod som m�ter kinetisk energi genom hastighet och massa
	 * @param mass
	 * @param velocity
	 * @return
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double e = mass * velocity * velocity/2;
		return e;
	}
	/**
	 * en metod som m�ter potentiel energi genom massa och hastighet
	 * @param mass
	 * @param height
	 * @return
	 */
	 public static double potentialEnergy(double mass, double height) {
		double a = mass * G * height;
		return a;
	}
	/**
	 * en metod som m�ter hastigheten p� ett fallande f�rem�l innan den landar
	 * @param height
	 * @return
	 */
	public static double fallSpeed(double height) {
		double f = Math.sqrt(2 * G * height);
		return f;
	}
	/**
	 *en metod som gemf�r tv� v�rden
	 * @param first
	 * @param last
	 * @return
	 */
	public static double delta(double first, double last) {
		return last - first;
	}
	/**
	 * en metod som omvandlar volymen till massa p� en v�tska
	 * @param fluid
	 * @param volume
	 * @return
	 */
	public static double volumeToMass(fluids fluid, double volume) {
	return volume*fluid.density;	
	}
	/**
	 * en metod som omvandlar volymen till massa p� en gas
	 * @param gas
	 * @param volume
	 * @return
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		return volume * gas.density;
	}
	/**
	 * en metod som omvandlar volymen till massa p� ett material
	 * @param solid
	 * @param volume
	 * @return
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
	return volume * solid.density;	
	}
	/**
	 * En metod som r�knar ut medelhastigheten med hj�lp av str�cka och tid
	 * @param distance
	 * @param time
	 * @return
	 */
	public static double svtVelocity(double distance, double time) {
		return distance/time;
	}
	/**
	 * En metod som r�knar ut str�cka med hj�lp av hastighet och tid
	 * @param velocity
	 * @param time
	 * @return
	 */
	public static double svtDistance(double velocity, double time) {
		return velocity*time;
	}
	/**
	 * En metod som r�knar ut tid f�r hj�lp av str�cka och hastighet
	 * @param distance
	 * @param velocity
	 * @return
	 */
	public static double svtTime(double distance, double velocity) {
		return distance/velocity;
	}
	/**
	 * En metod som r�knar ut arbete med hj�lp av kraft och str�cka
	 * @param force
	 * @param distance
	 * @return
	 */
	public static double work(double force, double distance) {
		return force*distance;
	}
	/**
	 * En metod som r�knar ut effekt med hj�lp av arbete och tid
	 * @param work
	 * @param time
	 * @return
	 */
	public static double power(double work, double time) {
		return work/time;
	}
	/**
	 * En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma ett visst material ett angivet antal grader
	 * @param solid
	 * @param mass
	 * @param deltaT
	 * @return
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return mass * solid.heatCapacity * deltaT;
	}
	/**
	 * En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss volym v�tska ett angivet antal grader
	 * @param fluid
	 * @param mass
	 * @param deltaT
	 * @return
	 */
	public static double heat(fluids fluid, double mass, double deltaT) {
		return mass * fluid.density * fluid.heatCapacity * deltaT; 
	}
	/**
	 * En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss volym gas ett angivet antal grader
	 * @param gas
	 * @param mass
	 * @param deltaT
	 * @return
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		return mass * gas.density * gas.heatCapacity * deltaT;
	}
	/**
	 * En metod som r�knar ut hur h�gt ett f�rem�l med en viss hastighet upp�t kommer.
	 * @param velocity
	 * @return
	 */
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2)/(2*9.82);
	}
	
	
	
}	