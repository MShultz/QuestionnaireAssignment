package shultz.mary.Questionnare;

import java.util.Iterator;

/**
 * Created by Mary on 5/12/2017.
 */
public class Questionnaire {
    QuestionnaireComponent allSections;

    public Questionnaire(QuestionnaireComponent allSections){
        this.setAllSections(allSections);
    }

    private void setAllSections(QuestionnaireComponent allSections){
        this.allSections = allSections;
    }

    public void printWholeQuestionnaire(){
        allSections.print();
    }


    public QuestionnaireComponent getQuestionnaire(){
        return allSections;
    }
}
