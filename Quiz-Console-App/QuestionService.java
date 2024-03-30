import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
    Scanner sc=new Scanner(System.in);
    ArrayList<Question> questions=new ArrayList<>();
    ArrayList<String> selection=new ArrayList<>();
    int score;
    public QuestionService() {
        questions.add(new Question(1,"What is the size of int?","4","2","8","10","4"));
        questions.add(new Question(2,"Which of the following is not a primitive data type in most programming languages?","Integer","String","Array","Boolean","Array"));
        questions.add(new Question(3,"What does HTML stand for?","Hyper Text Markup Language","Hyper Text Modifying Language","Hyperlinks and Text Markup Language","High Text Mode LanguageHigh Text Mode Language","Hyper Text Markup Language"));
        questions.add(new Question(4,"What is the result of 5 + 3 * 2?","11","2","8","10","11"));
        questions.add(new Question(5,"Which of the following is not a programming language?","Java","C","Adobe","Python","Adobe"));
    }
    public void addQuestion(){
        System.out.println("Enter Your Question");
        String question=sc.nextLine();
        System.out.println("Enter Options : ");
        String opt1=sc.nextLine();
        String opt2=sc.nextLine();
        String opt3=sc.nextLine();
        String opt4=sc.nextLine();
        System.out.println("Enter the Correct Answer : ");
        String ans=sc.nextLine();

        questions.add(new Question(questions.size()+1,question,opt1,opt2,opt3,opt4,ans));
        System.out.println("Successfully Added the Question!");
    }
// This method is used to display the questions to the users
    public void displayQuestions(){
        for (Question q:questions){
            System.out.println(q.getId()+". "+q.getQuestion());
            System.out.println("a. "+q.getOpt1()+"\nb. "+q.getOpt2()+"\nc. "+q.getOpt3()+"\nd. "+q.getOpt4());
            System.out.print("Type Your Ans:");
            selection.add(sc.nextLine());
            System.out.println();
        }
        calculateScore();
   }

   public void calculateScore(){
        int i=0;
        for (Question q:questions){
           if (q.getAns().equals(selection.get(i++))) score++;
        }

       System.out.println("Your Score is : "+score*2);
       System.out.println("Out of : "+i*2);
   }
}
