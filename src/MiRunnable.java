
public class MiRunnable implements Runnable{

	String palabra;
	/*
	 * Creamos y lanzamos un Thread al que le asignamos nuestro Runnable para que muestre durante 5 veces la palabra que le hemos 
	 * asignado a nuestro objeto MiRunnable
	 * */
	MiRunnable(String p) {
		this.palabra = p;
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i<5; i++) {
				System.out.println(this.palabra);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Murió");
		}
		
	}
	
	
}
