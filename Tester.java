package stapkg;
import java.util.*;
import java.io.*;

public class Tester {

	public static void main(String[] args) throws IOException {
		File input = new File("Student Answers.csv");
		Scanner scan = new Scanner(input);
		
		String[] temp = scan.nextLine().split(",");
		ArrayList<String> key = new ArrayList<String>();
		for (int i = 0; i < temp.length; i++)
			key.add(temp[i]);
		
		while (scan.hasNextLine()) {
			String[] data = scan.nextLine().split(",");
			ArrayList<String> answers = new ArrayList<String>();
			for (int i = 1; i < answers.size(); i++)
				answers.add(data[i]);
			
			Students student = new Students(data[0], answers);
			System.out.println(student);
		}
		scan.close();
	}
}
