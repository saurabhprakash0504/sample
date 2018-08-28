import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableExample c=new CallableExample ();
		FutureTask t=new FutureTask(c);
		t.run();
		System.out.println("after running");
		System.out.println(t.get());;
		System.err.println("after gett");
	}

	@Override
	public Integer call() throws IOException {
		System.err.println("I am inside this block");
		return 1;
	}
}
