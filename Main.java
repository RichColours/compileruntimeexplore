import java.util.concurrent.Callable;

public class Main {
	
	public static void main(final String[] args) throws Exception {

		// Thing implements Callable<String> .. until it doesn't
		final Thing thing = new Thing();

		doThingCall(thing);	
	}

	private static void doThingCall(final Callable<String> thing) throws Exception {

		
		System.out.println("Calling Thing.call() ...");
		System.out.println(((Thing) thing).call());


		System.out.println("Calling Callable.call() ...");
		System.out.println(thing.call());
	
	}
}
