package copycatch;
import java.awt.PageAttributes.MediaType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.net.URL;
import java.net.HttpURLConnection;
public class CopyCatch {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Copy Catch");
		Scanner input=new Scanner(System.in);
		String result = new String();
		String keyword;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the keyword");
				keyword=sc.next();
				System.out.println("The keyword you have entered is"+keyword);
				 String apiUrl = "https://jsonplaceholder.typicode.com/"+keyword;

			        try {
			            // Create URL object
			            URL url = new URL(apiUrl);

			            // Open connection
			            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			            // Set request method
			            connection.setRequestMethod("GET");

			            // Get response code
			            int responseCode = connection.getResponseCode();
			            System.out.println("Response Code: " + responseCode);

			            // Read response
			            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			            String line;
			            StringBuilder response = new StringBuilder();
			            while ((line = reader.readLine()) != null) {
			                response.append(line);
			            }
			            reader.close();

			            // Print response
			            System.out.println("Response: " + response.toString());

			            // Close connection
			            connection.disconnect();
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
				    
	}

}
