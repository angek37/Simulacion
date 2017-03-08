package CorridasMed;

import Aleatorios.*;
import javax.swing.*;

public class Capturador {
	public static void main(String mr[]){
		Calculos nGen = new Calculos();
		Corridas co = new Corridas();
		double randoms[];
		nGen.Calc();
		randoms=nGen.Randoms();
		double med = nGen.media();
		int c[] = new int[randoms.length];
		
		co.UpDown(med, randoms, c);
		co.ImpresionArray(c);
		co.Corrida(c);
	}

}
