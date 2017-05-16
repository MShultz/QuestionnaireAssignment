package shultz.mary.UI;

import shultz.mary.Questionnare.Question;
import shultz.mary.Questionnare.Questionnaire;
import shultz.mary.Questionnare.QuestionnaireComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Mary on 5/15/2017.
 */

public class TestProvider {
    private UserInput ui;
    private ArrayList<Questionnaire> allQuestionnaires;

    public TestProvider(UserInput ui) {
        this.ui = ui;

    }

    public void runTesting(ArrayList<Questionnaire> allQuestionnaires) {
        this.allQuestionnaires = allQuestionnaires;
        do {
            printTests();
            System.out.print("Please choose which questionnaire you'd like to take: ");
            int choice = ui.readint(allQuestionnaires.size());
            System.out.println("Answer Yes with a 1 and No with a 2");
            traverseQuiz(allQuestionnaires.get(choice));
            clearAnswers(allQuestionnaires.get(choice).getQuestionnaire().iterator());
            System.out.print("Would you like to continue taking tests? Yes (1) or No (2): ");
        }while(ui.readBool());
    }

    private void printTests() {
        int count = 0;
        for (Questionnaire quiz : allQuestionnaires) {
            System.out.println(count++ + ". " + quiz.getQuestionnaire().getInformation());
        }
    }

    private void traverseQuiz(Questionnaire currentQuiz) {
        Iterator<QuestionnaireComponent> quizIterator = currentQuiz.getQuestionnaire().iterator();
        traverse(quizIterator);
        currentQuiz.printWholeQuestionnaire();
    }

    private void traverse(Iterator<QuestionnaireComponent> section) {
        while (section.hasNext()) {
            QuestionnaireComponent current = section.next();
            if (current instanceof Question) {
                current.print();
                ((Question) current).setAnswer(ui.readBool());
            } else {
                System.out.println("****" + current.getInformation() + "****");
                traverse(current.iterator());
            }
        }
    }
    private void clearAnswers(Iterator<QuestionnaireComponent> questionnaireIterator){
        while(questionnaireIterator.hasNext()){
            QuestionnaireComponent current = questionnaireIterator.next();
            if(current instanceof Question){
                ((Question) current).setAnswer(null);
            }else{
                clearAnswers(current.iterator());
            }
        }
    }
}
