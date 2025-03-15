
public class Main {
    public static void main(String[] args) {
        // Define quiz questions
        Question[] questions = {
            new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2),
            new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 1),
            new Question("What is the largest ocean on Earth?", new String[]{"Atlantic", "Indian", "Pacific", "Arctic"}, 2),
            new Question("Who wrote 'Hamlet'?", new String[]{"Shakespeare", "Dickens", "Hemingway", "Austen"}, 0),
            new Question("What is the smallest prime number?", new String[]{"0", "1", "2", "3"}, 2)
        };

        // Create quiz and start
        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
