package Aleatorios;
public class Ran {
	public int ran(){
		int x0=555,x,i,n=100;
		double val,dx,xx=0,sum=0;
		dx=1.0/(n-1.0);
		for(i = 0; i < n; i++){
			if(x0%2==0){
				val= x0/155.0;
			}else{
				val=x0/179.0;
			}
			x=(int)val;
			val=val-x;
			sum+=val;
			xx+=dx;
			x0+=x;
		}
		System.out.println(sum/100.0);
		return 0;
	}
}
