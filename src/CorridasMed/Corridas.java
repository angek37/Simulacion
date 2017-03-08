package CorridasMed;

public class Corridas {
	
	public void UpDown(double med, double num[], int c[]){
		for(int i = 0; i<num.length; i++){
			if(num[i] > med){
				c[i] = 1;
			}else{
				c[i] = 0;
			}
		}
	}
	
	public void Corrida(int[] c){
		int n1=0;
		int n0=0;
		int flag=2;
		int Co=0;
		double esperado, var, estadistico;
		
		for(int i = 0; i<c.length; i++){
			if(c[i]==1){
				n1++;
			}else{
				n0++;
			}
			if(c[i]!=flag){
				Co++;
				flag=c[i];
			}
		}
		
		esperado=((2*n0*n1)/(double)c.length)+0.5;
		var=((2*n0*n1)*(2*n0*n1-(double)c.length))/(Math.pow((double)c.length, 2)*((double)c.length-1));
		estadistico=((double)Co-esperado)/var;
		
		System.out.print("Corridas: "+Co+"\nCeros: "+n0+"\nUnos: "+n1+
				"\nNumeros: "+c.length+"\n"+"Valor esperado: "+esperado+
					"\nVarianza del número de corridas: "+var+
						"\nEstadistico: "+estadistico);
	}
	
	public void ImpresionArray(int[] c){
		for(int i = 0; i<c.length; i++){
			System.out.print(c[i]+" ");
		}
		System.out.print("\n");
	}
	
}
