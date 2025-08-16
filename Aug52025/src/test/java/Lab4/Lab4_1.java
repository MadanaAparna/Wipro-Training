package Lab4;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4_1 {
	
public static void main(String[] args) {
	        String filePath = "sample.txt"; // your file path here

	        try {
	            // 1. Read content from the file
	            FileReader reader = new FileReader(filePath);
	            StringBuilder content = new StringBuilder();
	            int ch;
	            while ((ch = reader.read()) != -1) {
	                content.append((char) ch);
	            }
	            reader.close();

	            // 2. Reverse the content
	            content.reverse();

	            // 3. Write the reversed content back to the file
	            FileWriter writer = new FileWriter(filePath);
	            writer.write(content.toString());
	            writer.close();

	            System.out.println("File content reversed successfully!");
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}


