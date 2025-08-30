package network;

import java.time.LocalDateTime;

public class NetworkEvent {

	// Variables
	private String eventType;
	private String description;
	private String time;

	// Default Constructor
	public NetworkEvent(String eventType, String description) {
		this.eventType = eventType;
		this.description = description;
		
		// Replaced the "T" added in LocalDateTime and cut off milliseconds
		this.time = LocalDateTime.now().toString().replace("T", " ").substring(0, 19);
	}

	@Override
	public String toString() {
		return "Event Type: " + eventType + " | Description: " + description + " | Time: " + time;
	}

}
