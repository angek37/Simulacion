package Pi;

public class MonteCarlo2 {
	double tabla[][];
	float Nci=0;
	float pi=0;
	
	public MonteCarlo2(double[] r){
		super();
		int l=r.length;	
		System.out.println("imprimeme l "+l);
		tabla = new double[2][l/2];
		Metodo(r, tabla);
		Print(tabla, l);
		CalculoPi(tabla, l);
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
	
	public void CalculoPi(double tabla[][], int l){
		l=l/2;
		double sum=0;
		for(int x = 0; x<l; x++){
			sum=(Math.pow(tabla[0][x],2))+(Math.pow(tabla[1][x], 2));
			if(sum<1){
				Nci++;
			}
		}
		pi=4*(Nci/l);
		System.out.println("Nci--> "+Nci);
		System.out.println("pi= "+pi);
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
