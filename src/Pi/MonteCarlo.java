package Pi;

public class MonteCarlo {
	public MonteCarlo(double[] r){
		super();
		int l=r.length;
		double tabla[][] = new double[2][l/2];
		Metodo(r, tabla);
		Print(tabla, l);
	}
	public void Metodo(double[] r, double tabla[][]){
		int c = 0;
		for(int a = 0; a<r.length;){
			for(int b = 0; b<2; b++){
				tabla[b][c]=r[a];
				a++;
			}
			c++;
		}
	}
	
	public void Print(double tabla[][], int l){
		l=l/2;
		for(int x = 0; x<l; x++){
			for(int y = 0; y<tabla.length; y++){
				System.out.print(tabla[y][x]+"\t");
			}
			System.out.println("\n");
		}
	}
}
