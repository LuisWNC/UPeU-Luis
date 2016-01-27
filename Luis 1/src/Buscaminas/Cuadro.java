package Buscaminas;

import javax.swing.JButton;
/**
 *
 * @author LUIS
 */
public class Cuadro extends JButton {
    private boolean mina; //propiedad de cuadro mina y puede ser verdadero o falso
    
    public Cuadro(){ //constructor
    	
        super();
        double random = Math.random(); //valor aleatorio
        if (random>0.9) // dificultad. si pondriamos 0.5 seria un 50% de posibilidad de cuadros minados
            mina=true;
        else
            mina=false;
    }
    public boolean estaMinado()
    {// nos regeresa el valor de la mina si es verdadero o flaso (si esta minado o no)
        return mina;
    }
}
