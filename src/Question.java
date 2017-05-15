/**
 * Created by Mary on 5/12/2017.
 */
public class Question extends QuestionnaireComponent {
    private String question;
    public Question(String question){
        this.setQuestion(question);
    }

    public void print(){
        System.out.println(question);
    }
    private void setQuestion(String question){
        this.question = question;
    }
}
