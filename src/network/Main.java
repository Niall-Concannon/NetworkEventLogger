package network;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// Loop Random Event Objects - Until User Stops
		for(int i = 0; i > -1; i++) {
			try {
				NetworkEvent randomEvent = generateRandomEvent();
				System.out.println(randomEvent);
				
				Thread.sleep(rand.nextInt(5001));
			} catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}

	// Method to get random events
	public static NetworkEvent generateRandomEvent() {
		// Event Types and Descriptions
		String[] types = { "INFO", "WARNING", "ERROR" };
		String[] infoDescriptions = { "Connection Established", "Network Settings Updated", "HTTP Request Made" };
		String[] warningDescriptions = { "Slow Response Time Detected", "High Bandwidth Usage", "DNS Response Timeout" };
		String[] errorDescriptions = { "Connection Lost", "DHCP Failure", "Checksum Error" };
		
		Random rand = new Random();
		String type = types[rand.nextInt(types.length)];
		String description = "";
		if(type == "INFO") {
			description = infoDescriptions[rand.nextInt(infoDescriptions.length)];
		}
		else if(type == "WARNING") {
			description = warningDescriptions[rand.nextInt(warningDescriptions.length)];
		}
		else if(type == "ERROR") {
			description = errorDescriptions[rand.nextInt(errorDescriptions.length)];
		}
		
		return new NetworkEvent(type, description);
	}

}
