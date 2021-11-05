package problema_filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread {
	private int id_filosofo;
	private Palillo izda, dcha;
	
	public Filosofo(int id_filosofo, Palillo izda, Palillo dcha) {
		this.id_filosofo = id_filosofo;
		this.izda = izda;
		this.dcha = dcha;
	}
	
	public void run() {
		while(true) {
			try {
				izda.cogerPalillo(id_filosofo);
				dcha.cogerPalillo(id_filosofo);
				
				//comer
				dcha.dejarPalillo(id_filosofo);
				izda.dejarPalillo(id_filosofo);
				
			}catch(InterruptedException ex) {
				Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE,null, ex);
			}
		}
	}
}
