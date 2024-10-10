package CH25;

public class C02ThreadMain {
	public static void main(String[] args) throws Exception {

		C02Worker1 w1 = new C02Worker1();
		C02Worker2 w2 = new C02Worker2();

		Thread th1 = new Thread(w1);
		Thread th2 = new Thread(w2);

		th1.start();
		th2.start();


		new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("TASK03...");
					try {
						Thread.sleep(300);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}

			}

		}.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD..");
			Thread.sleep(500);
		}
		
	}
}
