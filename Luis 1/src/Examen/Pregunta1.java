package Examen;

import java.util.Scanner;

public class Pregunta1 {

	public static void main(String[] args) {
		
		Scanner scm = new Scanner(System.in);
		
		double p = 0;
		
		System.out.println("ingrese el monto de la venta: ");
		
		double monto = scm.nextDouble();
		
		
		if (monto>0 && monto< 1000) 
			System.out.println("su valor es: "+monto+" no recibe bonificacion");
		else if (monto>=1000 && monto< 5000){
			p = monto*3/100;
		}else if (monto>=5000 && monto< 20_000){
			p = monto*5/100;
		}else if (monto>20_000){
			p = monto*8/100;
		}
		
		System.out.println("su valor es: "+monto+" Recibe una bonificacion de : " + p);
		
	}

}
