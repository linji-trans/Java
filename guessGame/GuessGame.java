import java.util.Scanner;

public class GuessGame {
	public static void main(String [] args) {
		String q1 = "What color is the sky?\n"
					+"(a)blue\n(b)yellow\n(c)red\n";
		String q2 = "What color is the clouds?\n"
					+"(a)magenta\n(b)white\n(c)green\n";
		
		Quiz [] questions = {
				new Quiz(q1, "a"),
				new Quiz(q2, "b")
				};

		Scanner keyboardInput = new Scanner(System.in);
		
		int score = 0;
		for(int m = 0; m < questions.length; m++) {
			System.out.println(questions[m].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[m].answer)) {
				score++;
			}
			
			
		}
		System.out.println("You got " + score + "/2!");
		
		
	}	
	
}
