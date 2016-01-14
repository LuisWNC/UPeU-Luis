package pe.edu.upeu.poo.clase2;

public class Repaso {

	public static void main(String[] args) {
		
		Repaso  r = new Repaso();
		
		double a = 1.67;
		double b = 69;
		int c = 45;
		int d = 25;
		/**
		 * suma +
		 * resta -
		 * multiplicacion *
		 * division /
		 * modulo %
		 * "Math"
		 */
		
		
		//Esta instruccion me sirve para imprimir en la consola
		System.out.println(r.sumar(c,d));
		
		System.out.println("Operaciones Logicas");
		
		/**
		 * And &&
		 * or ||
		 * Negacion !
		 */
		
		System.out.println(!true);
		
		System.out.println("el IGV es: "+r.calcuIGV(12890));
		
		System.out.println("indice de masa corporal es: "+r.calcIMC(b, a));

	}
	
	
	
	public int sumar(int sum1, int sum2){
		
		return sum1 + sum2;
	}
	
	public double calcuIGV(double monto){
		double igv = 18;
		
		return monto * igv / 100;
		
	}
	
	public double calcIMC(double peso, double altura){
		
		return peso / Math.pow(altura, 2);
	}

}
