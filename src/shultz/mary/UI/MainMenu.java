package shultz.mary.UI;


/**
 * Created by Mary on 5/15/2017.
 */
public class MainMenu {
    UserInput ui;
    Administrator admin;
    TestProvider tester;
    public MainMenu(){
        ui = new UserInput();
        admin = new Administrator(ui);
        tester = new TestProvider( ui);
    }
    public void run(){
        do {
            System.out.print("Would you like to enter Administrator mode or Questionnaire mode?\nPress 1 for Administrator mode and 2 for Questionnaire mode: ");
            if (ui.readBool()) {
                admin.runAdmin();
            } else {
                tester.runTesting(admin.getQuizzes());
            }
            System.out.print("Would you like to return to the main menu? Yes (1) or No (2): ");
        }while(ui.readBool());
    }
}
