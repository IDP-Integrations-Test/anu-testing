package Java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FilePath = "C:\\Users\\anune\\OneDrive\\Documents\\Calender.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(FilePath))){
			
			String line;
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			
		 System.out.println("Error"+e.getMessage());
		}
		
		
		

	}

}
