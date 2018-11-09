package fysik_uppgift;

public enum GasTable {
	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92),
	AR (1.78,0.52),
	CL2(3.21,0.50),
	C02(1.98,0.82),
	N2(1.25,1.04),
	NE(0.90,1.03)
	
	;

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}
}
