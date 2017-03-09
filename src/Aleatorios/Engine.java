package Aleatorios;

public class Engine {
	double arr[];
	double med[] = new double[1];
	
	public Engine(int n){
		super();
		int x0=37, x=0, a=8, b=3, c=7;
		double val=0, sum=0;
		Calc(n, x0, a, b, c, val, x, sum);
	}
	
	double Chi(double arr[], int n){
		int i,j,cont;
		int inte=(int)Math.sqrt(n);
		int rel[] = new int[inte];
		int Teo[] = new int[inte];
		double rang = 0;
		double dx = 1.0/(double)(inte), sum;
		double jiAlpha = 44.98;
		rang=0;
		sum=0;
		for(i = 0; i< inte; i++){
			cont = 0;
			for(j=0; j < n; j++){
				if(arr[j]>=rang && arr[j]<rang+dx){
					cont++;
				}
			}
			rel[i]=cont;
			Teo[i]=n/inte;
			double lol=rang+dx;
			System.out.println(rang+"\t"+lol+"\t"+rel[i]+"\t"+Teo[i]+"\t"+
					(Math.pow(Teo[i]-rel[i], 2)/(double)Teo[i]));
			sum+=(Math.pow(Teo[i]-rel[i], 2)/(double)Teo[i]);
			rang+=dx;
		}
		
		if(sum<=jiAlpha){
			System.out.println("Es uniforme: "+sum);
		}else{
			System.out.println("No es uniforme: "+sum);
		}
		return 0.0;
	}
	
	public int Calc(int n, int x0, int a, int b, int c, double val, int x, double sum){
		arr = new double[n];
		for(int i = 0; i < n; i++){
			x0=(a*x0*x0+b*x0+c)%n;
			x=(int)val;
			val=x0/((double)n-1);
			arr[i]=val;
			sum+=val;
		}
		med[0]=sum;
		return 0;
	}
	
	public double[] getNums(){
		return arr;
	}
}
