package Examen;

import java.util.Scanner;

public class Pregunta2 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("ingrese un valor para evaluar: ");
		int v;
		v = scn.nextInt();
				
		if (v == 1)System.out.println(v+"La vocal es la A");
		else if (v == 2)System.out.println(v+"La vocal es la E");
		else if (v == 3)System.out.println(v+"La vocal es la I");
		else if (v == 4)System.out.println(v+"La vocal es la O");
		else if (v == 5)System.out.println(v+"La vocal es la U");
		else System.out.println("Su valor no coincide con el limite");
		
	}

}
