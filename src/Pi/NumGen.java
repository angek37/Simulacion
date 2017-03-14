package Pi;

import Aleatorios.*;

public class NumGen {
	public static void main(String mr[]){
		Engine e = new Engine(1000);
		MonteCarlo m = new MonteCarlo(e.randoms());
	}
}