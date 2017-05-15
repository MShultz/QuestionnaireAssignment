import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Mary on 5/12/2017.
 */
public class Section extends QuestionnaireComponent {
    private ArrayList<QuestionnaireComponent> sectionComponents = new ArrayList<>();
    private String sectionName;

    public Section(String sectionName) {
        this.setSectionName(sectionName);
    }

    public void add(QuestionnaireComponent sectionComponent){
        sectionComponents.add(sectionComponent);
    }

    public void remove(QuestionnaireComponent sectionComponent){
        sectionComponents.remove(sectionComponent);
    }

    public QuestionnaireComponent getChild(int child){
        return sectionComponents.get(child);
    }

    public void print() {
        System.out.println("****" + this.sectionName + "****");

        Iterator<QuestionnaireComponent> section = sectionComponents.iterator();
        while(section.hasNext()){
            section.next().print();
        }
    }

    private void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
