package rashmi.practice.thread;

public class CreateThread implements Runnable {
	private String name;
	private int age;
	
	public CreateThread(String name) {
		this.name = name;
//		this.age = age;
	}
	
	public void run() {
		for(int i = 0; i < 5;i++) {
			 System.out.println("[" + Thread.currentThread().getName() + "] [data=" + 
			           this.name + "] Message " + i);
			           try {
			               Thread.sleep(200);
			           } catch (final InterruptedException e) {
			               e.printStackTrace();
			           }
		}
	}

	

}
