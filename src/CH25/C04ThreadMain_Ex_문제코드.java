package CH25;

class IncrementThread implements Runnable {
	private static int counter = 0;

	// lock object 설정(임계영역 접근 여부를 판단하는 기준)
	private static final Object LOCK = new Object();

	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {

			// 임계영역 지정 - 하나의 스레드가 들어오면 다른 스레드의 접근이 제한되는 영역
			synchronized (LOCK) {
				counter++; // 공유변수값증가
				System.out.println(Thread.currentThread().getName() + "s counter : " + counter);

				if (i < 50000) { // i 가 99999 이하 (반복문을 벗어나지 않을 때) 이면 잠깐 대기
					try {
						LOCK.notify(); // 다른 스레드에게 점유 권한 양보 (작업이 끝났다고 알려줌)
						LOCK.wait(5);
					}

					catch (InterruptedException e) {
						e.printStackTrace();
						break;
					}
	
				} // if 끝
				else {
				
					LOCK.notify();

				}
				
				
				
			} // synchronized 끝
			
		} // for문끝
		
	}
	
}

public class C04ThreadMain_Ex_문제코드 {

	public static void main(String[] args) throws InterruptedException {

		IncrementThread incrementThread1 = new IncrementThread();
		IncrementThread incrementThread2 = new IncrementThread();
		IncrementThread incrementThread3 = new IncrementThread();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);
		Thread thread3 = new Thread(incrementThread3);

		thread1.setName("TH1");
		thread2.setName("TH2");
		thread3.setName("TH3");

		thread1.start();
		thread2.start();
		thread3.start();

		// 메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join();
		thread2.join();
		thread3.join();

		System.out.println("Final value: " + new IncrementThread().getCounter());

	}
}
