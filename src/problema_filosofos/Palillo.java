package problema_filosofos;

public class Palillo {
	private int id_palillo;
	private boolean libre = true;
	
	public Palillo (int id_palillo) {
		this.id_palillo = id_palillo;
	}
	
	public synchronized void cogerPalillo(int i) throws InterruptedException {
		while(!libre)
			wait();
		System.out.println("El filosofo: " +i+ " coge el palillo " +id_palillo);
		libre = false;
	}
	
	public synchronized void dejarPalillo(int i) {
		libre = true;
		System.out.println("El filosofo: " +i+ " suelta el palillo " +id_palillo);
		notify();
	}
	
	
}
