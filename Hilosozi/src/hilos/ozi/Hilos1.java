package hilos.ozi;

class Hilos1 {
	
	public static void main(String[] args) {
		
	System.out.println("Hilo main (INICIO)");
	
	HiloRunnable objHilo = new HiloRunnable("Hilo Primero");
	HiloRunnable1 objHilo1 = new HiloRunnable1("Hilo Segundo");
	
	Thread varHilo = new Thread(objHilo);
	Thread varHilo1 = new Thread(objHilo1);
	
	varHilo.start();
	varHilo1.start();
	
	for(int i=0; i<30; i++) {
		System.out.print(",");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException exc) {
			System.out.println("Hilo main (INTERRUPCION");
		}
	}
	System.out.println("Hilo main (FINAL)");
	}
}
