package network;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

	private String filePath;
	
	// Constructor
	public Logger(String filePath) {
		this.filePath = filePath;
	}
	
	// Write to File
	public void logEvent(NetworkEvent event) {
		try(FileWriter writer = new FileWriter(filePath, true)) {
			writer.write(event.toString() + "\n");
		} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
	}

}
