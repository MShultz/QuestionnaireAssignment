package shultz.mary.UI;

import shultz.mary.Questionnare.Question;
import shultz.mary.Questionnare.Questionnaire;
import shultz.mary.Questionnare.QuestionnaireComponent;
import shultz.mary.Questionnare.Section;


import java.util.ArrayList;

/**
 * Created by Mary on 5/12/2017.
 * Questions pulled from: http://www.home-speech-home.com/yes-or-no-questions.html
 */
public class Administrator {
    private ArrayList<Questionnaire> listOfTests;
    private UserInput ui;

    public Administrator(UserInput ui) {
        this.ui = ui;
        listOfTests = new ArrayList<>();
        listOfTests.add(createDefaultTest());
    }

    public void runAdmin() {
        boolean continueAdmin;
        System.out.println("Welcome to Administration mode!");
        do {
            System.out.print("Press 1 to create a new Quiz, and press 2 to exit: ");
            if (continueAdmin = ui.readBool()) {
                createQuiz();
            }
        } while (continueAdmin);
    }


    private void createQuiz() {
        System.out.print("Please name your Quiz: ");
        QuestionnaireComponent questionnaire = new Section(ui.readLine());
        Questionnaire currentQuestionnaire = new Questionnaire(questionnaire);
        listOfTests.add(currentQuestionnaire);
        addLoop((Section) questionnaire);
        System.out.println("********");
        System.out.println(questionnaire.getInformation());
        System.out.println("********");
        currentQuestionnaire.printWholeQuestionnaire();

    }

    private void addLoop(Section currentSection) {
        do {
            System.out.println("Adding to the section ****" + currentSection.getInformation() + "****");
            System.out.print("Would you like to add a section (1) or a question (2): ");
            if (ui.readBool()) {
                System.out.print("Please input the section name: ");
                Section newSection = new Section(ui.readLine());
                currentSection.add(newSection);
                addLoop(newSection);
            } else {
                System.out.print("Please enter your question: ");
                currentSection.add(new Question(ui.readLine()));
            }
            System.out.print("Would you like to continue to current section: **" + currentSection.getInformation() + "**? Yes (1) and No (2): ");
        } while (ui.readBool());
    }

    public ArrayList<Questionnaire> getQuizzes() {
        return listOfTests;
    }

    private Questionnaire createDefaultTest() {
        QuestionnaireComponent questionnaire = new Section("Default");
        QuestionnaireComponent animalSection = new Section("Animals");
        QuestionnaireComponent foodSection = new Section("Food");
        QuestionnaireComponent peopleSection = new Section("People");
        QuestionnaireComponent livingSection = new Section("Living");
        QuestionnaireComponent otherSection = new Section("Other");

        questionnaire.add(animalSection);
        questionnaire.add(foodSection);
        questionnaire.add(peopleSection);
        questionnaire.add(otherSection);

        animalSection.add(new Question("Are lizards small?"));
        animalSection.add(new Question("Can pigs walk on two feet?"));
        animalSection.add(new Question("Are wild animals dangerous?"));

        foodSection.add(new Question("Are coffee and hot chocolate cold drinks?"));
        foodSection.add(new Question("Can you eat tomato soup with a fork?"));
        foodSection.add(new Question("Can you make bread without using flour?"));
        foodSection.add(new Question("Are scoops of ice cream sweet?"));

        peopleSection.add(new Question("Can you grow a mustache on your foot?"));
        peopleSection.add(new Question("Can you touch your elbow with your nose?"));

        peopleSection.add(livingSection);

        livingSection.add(new Question("Can you ride a bike without a helmet?"));
        livingSection.add(new Question("Can you wear a tie?"));
        livingSection.add(new Question("Can you drive a car without using a seatbelt?"));
        livingSection.add(new Question("Are umbrellas used to keep you wet?"));

        peopleSection.add(new Question("If you were rotten, would you smell nice?"));

        otherSection.add(new Question("Do plants wear glasses?"));
        otherSection.add(new Question("If you were a builder, would you have a hammer?"));
        otherSection.add(new Question("Are you alive?"));
        return new Questionnaire(questionnaire);
    }
}
