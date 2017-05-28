package montecarlo;

import javax.swing.JOptionPane;
import org.lsmp.djep.djep.*;

public class AleatorioMontecarlo{
    //double[] random;
    int noAleatorios;
    double sum=0.0,datoCuadrado,monte;
    
    public static void main(String[] args){
        AleatorioMontecarlo objAleatorio = new AleatorioMontecarlo();
        objAleatorio.datos();
        //objAleatorio.IngresoAleatorios();
        objAleatorio.Integral();
        objAleatorio.capturar();
    }
    
    public void datos(){
        String aux = "Ingrese numero de datos aleatorios";
        noAleatorios = Integer.parseInt (JOptionPane.showInputDialog(null,aux)); 
    }
    
    public void IngresoAleatorios(){
        //random = new double[NoAleatorios];
        for(int i=0;i<noAleatorios;i++){
           // random[i] = Math.random();
           //System.out.println(random[i]);
        }
    }
    
    public void Integral(){        
        for(int i=0;i<noAleatorios;i++){
            
            datoCuadrado = Math.pow(Math.random(), 2);
            sum = sum + datoCuadrado;
        }
        System.out.println("Sumatoria: "+sum);
        System.out.println("total datos: "+noAleatorios);
        
        
        monte = (1/(double)noAleatorios);
        System.out.println("uno sobre numero aleatorio: "+monte);
        
        monte = monte *sum;
        
        System.out.println("\n\nValor de la prueba: "+monte);
    }

    public void capturar(){
        DJep jep=new DJep(); //crea objeto djep
        String integral = JOptionPane.showInputDialog("Introduzca la integral a evaluar:");
        try{
            double obj=0;
            jep.addVariable("x",0); //busca la variable que asignes, en este caso, X
            jep.parse(integral); //analiza la cadena de texto
            
            for (int i = 0; i < 10000; i++) { //ciclo for del montecarlo
                jep.addVariable("x", Math.random()); //le asigna un valor aleatorio a la variable para evaluar la integral
                Object result = jep.evaluate(jep.parse(integral)); //evalua la integral
                obj+=(double)result; //suma el resultado de la integral evaluada en X
            }
            obj=obj/5000; //divide entre la cantidad de veces que se evaluó la integral
            System.out.println("(Integral)"+integral+" = "+obj); //imprime
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}