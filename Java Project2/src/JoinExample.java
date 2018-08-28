
public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		Example2 e=new Example2();
		Thread t1=new Thread(e);
		Thread t2=new Thread(e);
		t1.start();
		Thread.yield();
		t2.start();
	}
}

class Example2 implements Runnable {
	public void run() {
		System.out.println("inside run "+Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("values >> "+i +" "+Thread.currentThread().getName());
		}
	}
}