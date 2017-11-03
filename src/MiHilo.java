
public class MiHilo extends Thread {
	
	String palabra;
	/*
	 * Creamos un Thread que ejecuta un bucle de 5 ciclos en el que mostramos la palabra (adios u hola) y lo dormimos durante 1 segundo
	 * */
	public MiHilo(String p) {
		this.palabra = p;
	}
	
	@Override
	public void run() {

		try {
			for(int i = 0; i<5; i++) {
				System.out.println(this.palabra);
				sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Se murió");
		}

	}
	
}
