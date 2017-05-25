package Pi;

public class MonteCarlo {
	
	
	public MonteCarlo(double[] r){
		super();
		float Nci=0;
		float pi=0;
		int l=r.length;	
		System.out.println("imprimeme l "+l);
		double tabla[][] = new double[2][l/2];
		Metodo(r, tabla);
		//Print(tabla, l, Nci, pi);
		CalculoPi(tabla, l,Nci,pi);
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
	
	public void Print(double tabla[][], int l, float Nci, float pi){
		l=l/2;
		for(int x = 0; x<l; x++){
			for(int y = 0; y<tabla.length; y++){
				System.out.print(tabla[y][x]+"\t");	
			}
			System.out.println("\n");
		}
	}
	
	public void CalculoPi(double tabla[][], int l, float Nci, float pi){
		l=l/2;
		double num1=0, num2=0, sum=0;
		int c=0;
		for(int x = 0; x<l; x++){
			for(int y = 0; y<tabla.length; y++){
				switch(c){
				case 0:
					num1=tabla[y][x];
					c=1;
					break;
				case 1:
					num2=tabla[y][x];
					sum=(Math.pow(num1,2))+(Math.pow(num2, 2));
					//System.out.println("sum es="+sum);
					c=0;
					if(sum<1){
						Nci++;
					}
					break;
				}
			}
		}
		pi=4*(Nci/l);
		System.out.println("Nci--> "+Nci);
		System.out.println("pi= "+pi);
	}
}
