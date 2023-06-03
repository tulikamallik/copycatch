package copycatch;
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
				URL url = new URL("https://www.byrdie.com/what-is-eye-primer");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				    conn.setRequestMethod("GET");
				    try(BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream())))
				     {
					for(String line; (line= reader.readLine()) !=null; ) {
						result.concat(line);
					    System.out.println(result);
				}
				     }
				    
	}

}
