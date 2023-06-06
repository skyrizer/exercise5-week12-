package exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RainFall {

	 public static void main(String[] args) {
	        String fileName = "rainfall_data.bin";
	        double[] rainfallData = { 5.0, 0, 0, 4.0, 1.0, 0 };

	        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
	            for (double rainfall : rainfallData) {
	                outputStream.writeDouble(rainfall);
	            }
	            System.out.println("Rainfall data has been written to the file: " + fileName);
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing the rainfall data to the file: " + e.getMessage());
	        }
	    }

}
