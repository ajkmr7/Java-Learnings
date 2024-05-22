
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question("Size of int?", 1, "1", "2", "4", "8", "4");
        questions[1] = new Question("Size of double?", 2, "2", "4", "16", "8", "8");
        questions[2] = new Question("Size of char?", 3, "2", "1", "4", "8", "2");
        questions[3] = new Question("Size of long?", 4, "4", "8", "16", "2", "4");
        questions[4] = new Question("Size of boolean", 5, "2", "8", "16", "4", "2");
    }

    public void playQuiz() {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        for (Question question : questions) {
            System.out.println("Question no: " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            selection[i] = scanner.nextLine();
            i++;
        }

        for (String s : selection) {
            System.err.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];

            String answer = question.getAnswer();
            String userAnswer = selection[i];

            if (answer.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("Your score is: " + score);
    }
}
