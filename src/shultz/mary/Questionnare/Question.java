package shultz.mary.Questionnare;


import java.util.Iterator;

/**
 * Created by Mary on 5/12/2017.
 */
public class Question extends QuestionnaireComponent {
    private String question;
    private Boolean answer = null;

    public Question(String question) {
        this.setQuestion(question);
    }

    public Iterator<QuestionnaireComponent> iterator() {
        return new NullIterator();
    }

    public String getInformation() {
        return question;
    }

    public void print() {
        System.out.println(question + (answer == null ? "" : "\t" + answer.toString()));

    }

    public void setAnswer(Boolean answer){
        this.answer = answer;
    }

    private void setQuestion(String question) {
        this.question = question;
    }
}
