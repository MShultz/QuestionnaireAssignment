package shultz.mary.UI;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by Mary on 5/15/2017.
 */
public class UserInput {
    Scanner scan;

    public UserInput() {
        scan = new Scanner(System.in);
    }

    public void close() {
        scan.close();
    }

    public boolean readBool() {
        String response = scan.nextLine();
        while (!response.equals("1") && !response.equals("2")) {
            System.out.println("Invalid input, please use the values 1 and 2");
            response = scan.nextLine();
        }
        return response.equals("1") ? true : false;
    }

    public String readLine() {
        return scan.nextLine();
    }

    public int readint(int numChoices) {
        int choice = -1;
        boolean valid = true;
        do {
            try {
                choice = Integer.parseInt(scan.nextLine());
                valid = choice >= 0 && choice < numChoices;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: not a number.");
                valid = false;
            }
        } while (!valid);
        return choice;
    }

}
