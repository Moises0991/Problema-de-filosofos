package problema_filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread {
	private int id_filosofo;
	private Palillo izda, dcha;
	private Silla silla;
	
	public Filosofo(int id_filosofo, Palillo izda, Palillo dcha, Silla silla) {
		this.id_filosofo = id_filosofo;
		this.izda = izda;
		this.dcha = dcha;
		this.silla = silla;
	}
	
	public void run() {
		while(true) {
			try {
				silla.ocupar_silla(id_filosofo);
				izda.cogerPalillo(id_filosofo);
				dcha.cogerPalillo(id_filosofo);
				
				//comer
				dcha.dejarPalillo(id_filosofo);
				izda.dejarPalillo(id_filosofo);
				silla.liberar_silla(id_filosofo);
				
			}catch(InterruptedException ex) {
				Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE,null, ex);
			}
		}
	}
}
