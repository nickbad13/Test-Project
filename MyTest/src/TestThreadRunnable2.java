import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadRunnable2 implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("This is currently running on the main thread," + 
					"the ID is:" + Thread.currentThread().getId());
		TestThreadRunnable2 worker = new TestThreadRunnable2 ();
		Thread thread = new Thread(worker);
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		Thread t8 = new Thread(worker);
		t8.start();
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + "Main finished running....");
	}
	
	public void run()
	{
	 LocalDateTime ldt =  LocalDateTime.now();
		System.out.println(ldt + "This is currently running on a separate thread," +
				"the ID is:" + Thread.currentThread().getId());
	}
}
		