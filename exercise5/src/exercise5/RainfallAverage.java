package exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * This program demonstrate reading data from a file using FileInputStream
 * and calculate the average of the data.
 *
 * @author wafirdzihni
 *
 */ 

public class RainfallAverage {

	private int total=0;
	private int average = 0;
	private int day = 6;
	private String filename;
	
	/*
	 * Class constructor
	 */
	
	public RainfallAverage(String filename) {
		this.filename = filename;
	}
	
	/*
	 * Method to calculate average of rainfall data at Simpang Ampat
	 * 
	 */
	public void calculateAvg() {
		
		/*
		 * Read data from file rainfall_data.bin
		 * Calculate total of the data
		 * calculate average of the data
		 * 
		 */
		
		try (
				
			DataInputStream inputStream = new DataInputStream(new FileInputStream(filename))) {
			System.out.println("Rainfall Data:");
			System.out.println("---------------");
			
			// Read values of array from the stream
			for (int i = 0; i < 6; i++) {
				int rain = inputStream.readInt();
				
				// calculate total of the rainfall data
				total += rain;
			
			}
			
			// Close stream
			inputStream.close();
			
			// Calculate average of rainfall data 
			average = total / day;
			
			// display the calculated average
			System.out.println("Average rainfall from station Simpang Ampat : " + average);
			System.out.println();
			
		} catch (IOException e) {
			
			// If there an error, this message will be displayed.
			System.out.println("An error occurred while reading the rainfall data: " + e.getMessage());
		}
		
			
	}


}
