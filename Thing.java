import java.util.concurrent.Callable;

public class Thing implements Callable<String> {
	

	public String call() {

		return "Expected implementation message";
	}

}
