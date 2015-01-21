package stapkg;
import java.util.*;

public class Students {
	private String name;
	private ArrayList<String> answers;
	
	public Students(String name, ArrayList<String> studentAnswers) {
		this.name = name;
		answers = studentAnswers;
	}
	
	public String getName() {return name;}
	public ArrayList<String> getAnswers() {return answers;}
	
	public double getScore(ArrayList<String> key) {
		double score = 0;
		for (int i = 1; i < answers.size(); i++)
			if (answers.get(i) == key.get(i))
				score += 1;
			else if (!answers.get(i).equals("?"))
				score -= 0.25;
		return score;
	}
	
	public String toString() {
		String str = name;
		for (int i = 0; i < answers.size(); i++)
			str += answers.get(i);
		
		return str;
	}
}
