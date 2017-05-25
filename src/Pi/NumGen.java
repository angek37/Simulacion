package Pi;

import Aleatorios.*;

public class NumGen {
	public static void main(String mr[]){
		Engine e = new Engine(1024);
		MonteCarlo2 m = new MonteCarlo2(e.getNums());
	}
}