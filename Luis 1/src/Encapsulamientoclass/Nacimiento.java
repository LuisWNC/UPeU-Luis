package Encapsulamientoclass;

public class Nacimiento {
	public String nombre;
	private int dia;
	private int mes;
	private int anio;
	protected String apellido;
	//constructor con ningun parametro
	
	public Nacimiento() {
		this.nombre = "luis";
		this.apellido = "ninacondo";
		this.dia = 1;
		this.mes = 1;
		this.anio = 1999;	
	}	
	//el metodo set nos permite cambiar el atributo
	public void setDia(int dia){
		if (dia<32 && dia>0) { //si dia es menor que 32 y mayor que cero entonces:
			this.dia =dia;		
		}			
	}
	//el metodo get nos permite obtener el atributo
	public int getDia(){
		return this.dia;	
	}
	public void setMes(int mes){
		if (mes<13 && mes>0) {
			this.mes = mes;	
		}
	}
	public int getMes() {
		return this.mes;
	}
}
