package Aleatorios;
public class Calculos {
	int x0=37, x, i, n=1024, a=7, b=3, c=8;
	double val, dx, xx=0, sum=0;
	double arr[]= new double[n];
	
	double var(double arr[], double miu, int n){
		int i;
		double sum=0;
		for(i = 0; i < n; i++){
			sum+=Math.pow(arr[i]-miu, 2);
		}
		return sum/((double)n-1);
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
		System.out.println(dx);
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
	
	public int Calc(){
		for(i = 0; i < n; i++){
			x0=(a*x0*x0+b*x0+c)%n;
			x=(int)val;
			val=x0/((double)n-1);
			System.out.print(val+"\n");
			arr[i]=val;
			sum+=val;
		}
		Chi(arr,n);
		System.out.println("med: "+sum/1024.0+"\t var:"+var(arr,sum/1024.0,n));
		return 0;
	}
	

}