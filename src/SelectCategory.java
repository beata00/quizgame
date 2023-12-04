import java.util.ArrayList;
import java.util.List;

public class SelectCategory {

    QuestionReader reader = new QuestionReader();
    List<Question> questions = new ArrayList<Question>();

    public List<Question> readFromTxtFile(int input) {
        
        if(input == 1)
           
           {
                System.out.println("You chose Muzic , lets begin: ");

                questions = reader.readQuestionsFromFile("resource/musik.txt");
                return questions;
               
            }

            else if(input==2) {
                System.out.println("You chose Sport, lets begin: ");
                questions = reader.readQuestionsFromFile("resource/sports.txt");
                return questions;
              

            }

            else if(input==3) {
                System.out.println("You chose History, lets begin: ");
                questions = reader.readQuestionsFromFile("resource/history.txt");
                return questions;
              
            }
           else if(input==4) {
                System.out.println("You chose Science, lets begin: ");
                questions = reader.readQuestionsFromFile("resource/science.txt");
                return questions;
                
            }
         else if(input==5) {
                System.out.println("You chose All the categories above, lets begin: ");
                questions = reader.readQuestionsFromFile("resource/All.txt");
                return questions;
                
            }

           else
                {System.out.println("Wrong choice, pls choose between 1-5");
                return questions; 
                }

    }
}

