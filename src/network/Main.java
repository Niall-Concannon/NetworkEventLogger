package network;

public class Main {

	public static void main(String[] args) {
		// Event Objects
		NetworkEvent event1 = new NetworkEvent("INFO", "Connection Established");
		NetworkEvent event2 = new NetworkEvent("WARNING", "Slow Response Time Detected");
		NetworkEvent event3 = new NetworkEvent("ERROR", "Connection Lost");

		System.out.println(event1);
		System.out.println(event2);
		System.out.println(event3);
	}

}
