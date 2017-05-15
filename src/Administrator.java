/**
 * Created by Mary on 5/12/2017.
 * Questions pulled from: http://www.home-speech-home.com/yes-or-no-questions.html
 */
public class Administrator {
    public static void main(String[] args) {
        QuestionnaireComponent questionnaire = new Section("Default Questionnaire");
        QuestionnaireComponent animalSection = new Section("Animals");
        QuestionnaireComponent foodSection = new Section("Food");
        QuestionnaireComponent peopleSection  = new Section("People");
        QuestionnaireComponent livingSection = new Section("Living");

        questionnaire.add(animalSection);
        questionnaire.add(foodSection);
        questionnaire.add(peopleSection);

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

        Questionnaire defaultQuestionaire = new Questionnaire(questionnaire);
        defaultQuestionaire.printWholeQuestionnaire();








    }
}
