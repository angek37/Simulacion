package Pi;

public class MonteCarlo {
	double tabla[][];
	public MonteCarlo(double[] r){
		super();
		int l=r.length;
		tabla = new double[2][l/2];
		Metodo(r, tabla);
	}
	public void Metodo(double[] r, double tabla[][]){
		int c = 0;
		double aux = 0.0; // Almacena de forma temporal el resultado de la operación de x^2+y^2
		int n = 0;			// cuenta cuantos valores están dentro del circulo
		double pi = 0.0;	// apoximación al valor de pi
		for(int a = 0; a<r.length;){
			for(int b = 0; b<2; b++){
				tabla[b][c]=r[a];
				a++;
			}
			c++;
		}
		for(int x = 0; x < (r.length/2); x++){
			aux = Math.pow(tabla[0][x], 2) + Math.pow(tabla[1][x], 2);
			System.out.println(aux);	// Imprime el resultado de la operación x^2+y^2
			if(aux <= 1){
				n++;
			}
		}
		pi = (4*n)/(double)(r.length/2);
		//Print(tabla, r.length);		//Imprime la tabla con los valores de x y
		System.out.println("Cantidad de números: "+(r.length/2)+
				"\nCantidad de números dentro del circulo: "+n+
					"\nAproximación de pi: "+pi);
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
	public double[][] getArr(){
		return tabla;
	}
}
