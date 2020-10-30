package hilos.ozi;

class HiloRunnable implements Runnable{
	
	String nombreHilo;
	
	HiloRunnable(String parNombre){
		nombreHilo = parNombre;
	}
	
	public void run() {
		System.out.println(nombreHilo + " (INICIO HILO 1)");
		try {
			for(int x=0; x<=10; x++) {
				Thread.sleep(2000);
				
				System.out.println(nombreHilo + " CORRIENDO HILO 1" + " x = " + x);
			}
		}catch(InterruptedException exc) {
			System.out.println(nombreHilo + " (INTERRUPCION HILO 1)");
		}
		
		System.out.println(nombreHilo  + " (FINAL HILO 1)");
	}

}
