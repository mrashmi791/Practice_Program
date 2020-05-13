package rashmi.practice.thread;

public class ByImplementingRunnable {

	public static void main(String[] args) {

		System.out.println("Thread main started");
		  
         Thread thread1 = new Thread(new CreateThread("Process data through Runnable interface")); 
        thread1.start();
        thread1.setName("Demo Thread");
         
  
        System.out.println("Thread main finished");
	}

}
