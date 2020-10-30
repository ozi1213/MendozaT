package hilos.ozi;

public class HiloRunnable1 implements Runnable{

String nombreHilos;
	
	HiloRunnable1(String pardeNombre){
		nombreHilos = pardeNombre;
	}
	
	public void run() {
		System.out.println(nombreHilos + " (INICIO HILO 2)");
		try {
			for(int x=0; x<=10; x++) {
				Thread.sleep(3000);
				int c = x + 1;
				System.out.println(nombreHilos + " CORRIENDO HILO 2 " + " x = " + c);
			}
		}catch(InterruptedException exc) {
			System.out.println(nombreHilos + " (INTERRUPCION HILO 2)");
		}
		
		System.out.println(nombreHilos  + " (FINAL HILO 2)");
	}
}
