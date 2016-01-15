package pe.edu.upeu.poo.practica1;

import java.util.Scanner;

public class practica1 {

	public static void main1(String[] args) {
		
		
		practica1 u=new practica1();
		Scanner scn=new Scanner(System.in);


		String resultado = "";

		double monto;
		double interes;
		if (monto <= 0 && monto <=10 ) {
			resultado =  mv;
		} else if (monto >= 1000 && monto <= 5000) {
			System.out.println(u.mv(monto, interes));
		} else if (monto >= 5000 && monto <= 20000) {
			System.out.println(u.mv(monto, interes));
		} else if (monto > 20000) {
			resultado = ;
		} else {
			resultado = "no valido";
		}
		
		System.out.println(resultado);

	}
	public double mv(double mon, double interes){
		
		return mon * interes / 100 ;



	}

}
