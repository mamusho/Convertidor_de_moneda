import com.convertidor.gui.Conversor;

public class Principal {

	public static void main(String[] args) {
		/*
		 * iniciamos una nueva instancia de el programa desde el controlador principal, asi como seteamos en true para poder visualizarlo, la location en null para que este de manera centrada en respecto al monitor. 
		 */
		Conversor conversor = new Conversor();
		conversor.setVisible(true);
		conversor.setLocationRelativeTo(null);

	}

}
