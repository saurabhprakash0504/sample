import java.util.LinkedList;
import java.util.Queue;

public class CustomBlockingQueue {

	Queue queue = new LinkedList<>();
	int MAX_SIZE = 10;

/*	synchronized void put(Object o) {
		while (true) {
			while (q.size() == MAX_SIZE) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(q.size()==0)
				q.notifyAll();
			q.offer(o);
		}
	}

	synchronized Object get() {
		Object o = null;
		while (true) {
			
			while (q.size() == 0) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if(q.size()==MAX_SIZE)
				q.notifyAll();
			return q.poll();

		}

	}*/

	
	public synchronized void put(Object task)
            throws InterruptedException  {
        while(this.queue.size() == MAX_SIZE) {
            wait();
        }
        if(this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.offer(task);
    }

    public synchronized Object get()
            throws InterruptedException{
        while(this.queue.size() == 0){
            wait();
        }
        if(this.queue.size() == MAX_SIZE){
            notifyAll();
        }
        return this.queue.poll();
    }
	
}
