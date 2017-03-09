package Pi;

public class NumGen {
	public static void main(String mr[]){
		double p[] = {0.1,0.2,0.4,0.5,0.6,0.7,0.8,0.9,0.01,0.2};
		System.out.println(p.length);
		MonteCarlo m = new MonteCarlo(p);
	}
}