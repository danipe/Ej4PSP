
public class Main {

	public static void main(String[] args) {
		/*
		 * Ejercicio 5 hecho con Threads
		 * */
//		MiHilo hola = new MiHilo("hola");
//		MiHilo adios = new MiHilo("adios");
//		hola.start();
//		adios.start();
		
		/*
		 * Ejercicio 5 hecho con Runnables
		 * */
		MiRunnable holaR = new MiRunnable("hola");
		MiRunnable adiosR = new MiRunnable("adios");

	}

}
