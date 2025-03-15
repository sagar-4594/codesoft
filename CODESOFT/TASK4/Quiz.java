import java.util.Scanner;

class Quiz {
    private Question[] questions;
    private int score;
    private long startTime;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            Question currentQuestion = questions[i];
            currentQuestion.displayQuestion();

            // Start timer
            long questionStartTime = System.currentTimeMillis();
            long timeLimit = 10000; // 10 seconds per question

            // Wait for user's input or time limit
            int answer = -1;
            while (System.currentTimeMillis() - questionStartTime < timeLimit) {
                if (scanner.hasNextInt()) {
                    answer = scanner.nextInt() - 1;  // Subtract 1 to match the index of options
                    break;
                }
            }

            // Check if answer is correct
            if (answer != -1 && currentQuestion.checkAnswer(answer)) {
                score++;
                System.out.println("Correct!");
            } else if (answer == -1) {
                System.out.println("Time's up! The correct answer was: " + currentQuestion.options[currentQuestion.correctAnswerIndex]);
            } else {
                System.out.println("Incorrect! The correct answer was: " + currentQuestion.options[currentQuestion.correctAnswerIndex]);
            }
        }
        displayResult();
    }

    public void displayResult() {
        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);
    }
}
