package problema_filosofos;

public class Silla {
	private int sillas_libres = 4;
	
	public synchronized void ocupar_silla(int i) throws InterruptedException {
		
		while(sillas_libres == 0 ) {
			wait();
		}
		
		System.out.println("El filosofo: " +i+ " se sienta en una silla");
		sillas_libres--;
	}
	
	public synchronized void liberar_silla(int i) {
		sillas_libres++;
		System.out.println("El filosofo: " +i+ " libera la silla");
		notify();	
	}
}
