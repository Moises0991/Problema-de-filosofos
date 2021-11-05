package problema_filosofos;

public class Cena {

	public static void main(String[] args) {
		
		//creacion de las sillas
		Silla silla = new Silla();
		
		//creacion de los palillos
		Palillo[] palillos = new Palillo[5];
		
		for(int i=0; i<palillos.length; i++) {
			palillos[i] = new Palillo(i);
		}
		
		//creacion de los filosofos
		Filosofo[] filosofos = new Filosofo[5];
		
		for(int i=0; i<filosofos.length; i++) {
			filosofos[i] = new Filosofo(i, palillos[i], palillos[(i+1)%5],silla);
		}

		//hacemos comer a los filosofos
		
		for(int i=0; i<filosofos.length; i++) {
			filosofos[i].start();
		}
	}

}
