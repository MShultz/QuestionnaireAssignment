/**
 * Created by Mary on 5/12/2017.
 */
public abstract class QuestionnaireComponent {
    public String getInformation(){
        throw new UnsupportedOperationException();
    }

    public void add(QuestionnaireComponent questionnaireComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(QuestionnaireComponent questionnaireComponent){
        throw new UnsupportedOperationException();
    }
    public QuestionnaireComponent getChild(int child){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
