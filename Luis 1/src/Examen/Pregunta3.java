package Examen;

import java.util.Scanner;

public class Pregunta3 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int numero ;
		System.out.println("ingrese un valor: ");
		numero = scn.nextInt();
		for (int i = 0 ; i <= numero ;i=i+2){
			System.out.println(i);
		}
	}
}
