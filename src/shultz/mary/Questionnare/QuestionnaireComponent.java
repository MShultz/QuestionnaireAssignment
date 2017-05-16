package shultz.mary.Questionnare;

import java.util.Iterator;

/**
 * Created by Mary on 5/12/2017.
 */
public abstract class QuestionnaireComponent {
    public String getInformation() {
        throw new UnsupportedOperationException();
    }

    public void add(QuestionnaireComponent questionnaireComponent) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator<QuestionnaireComponent> iterator() {
        throw new UnsupportedOperationException();
    }
}
