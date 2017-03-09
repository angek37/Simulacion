package Pi;

public class MonteCarlo {
	public MonteCarlo(double[] r){
		super();
		Metodo(r);
	}
	public void Metodo(double[] r){
		int l=r.length;
		double tabla[][] = new double[2][l/2];
		int c = 0;
		for(int a = 0; a<r.length;){
			for(int b = 0; b<2; b++){
				tabla[b][c]=r[a];
				a++;
			}
			c++;
		}
		for(int x = 0; x<5; x++){
			for(int y = 0; y<tabla.length; y++){
				System.out.print(tabla[y][x]+"\t");
			}
			System.out.println("\n");
		}
	}
}
