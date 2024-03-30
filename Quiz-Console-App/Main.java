import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionService service = new QuestionService();

        char choice;
        while (true) {
            boolean exit=false;
            System.out.println("Do You Want to Play?(y/n)");
            choice = sc.next().charAt(0);

            switch (choice) {
                case 'y':
                    service.displayQuestions();
                    break;

                case 'n':
                    System.out.println("Want to add questions?(y/n)");
                    char ch = sc.next().charAt(0);
                    if (ch == 'y' || ch == 'Y') {
                        service.addQuestion();
                    }else{
                        exit=true;
                        break;
                    }
                default:
                    System.out.println("Wrong Input.....");
            }
    if (exit) break;
        }
        System.out.println("Leaving Soon...... Bye!!");
    }
}
