package Calculator;

import java.util.Scanner;

public class AppLogic {


    public void readAndExecute() {
        int option = 0;


        do {
            MainMenu mm = new MainMenu();
            mm.printMenu();
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number:");

            option = scan.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Bye bye");
                    break;
                case 1:
                    Calculator calc = new Calculator();
                    System.out.println(calc.sum(scan.nextInt(), scan.nextInt()));
                    break;
                default:
                    System.out.println("Invalid menu option, please try again.");
            }
        } while (option != 0);
    }
}
