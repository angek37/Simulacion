package distribucion;

public class DistribucionN {

    int k, n;
    double m, sigma, xi;

    public DistribucionN() {
        k = 12;
        m = 1.6;
        sigma = 0.1;
        n = 1000;
    }

    public void generaXi() {
        xi = 0;
        for (int i = 0; i < k; i++) {
            xi += Math.random();
        }
        xi = ((xi-6)* sigma) + m;
    }
    
    public void imprimeXi(){
        System.out.println(xi);
    }
    
    public void convolucion(){
        for (int i = 0; i < n; i++) {
            generaXi();
            imprimeXi();
        }
    }

    public static void main(String[] args) {
    	DistribucionN DN = new DistribucionN();
        DN.convolucion();
    }
}