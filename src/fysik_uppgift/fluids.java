package fysik_uppgift;

public enum fluids {
	
	H20(0.998, 4.19, 0.0, 100.0, 2260.0), 
	WATER(0.998, 4.19, 0.0, 100.0, 2260.0),
	H2SO4(1.84, 1.38, 10.0, 336.0, 511.0),
	CH3OH(0.791, 2.50, -98,65,1100),
	C2H5OH(0.789,2.43, -177,78.2,841),
	C6H6(0.879,1.71,6,80,393),
	;
 	double density;
	double heatCapacity;
	double smeltPoint;
	double boilPoint;
	double steamEntalpy;
	
	fluids(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		smeltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}
}
