package Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        String author = "Danut";
//        int numberOfKg = 1231231313;
//        int secondInt = 1231231233;
//        double number = 33456;
//
//
//        double result = numberOfKg + number;
//        secondInt += 2; // secondInt = secondInt + 2;
//
//
//        System.out.println(author + " a plecat la piata, pe strada Bucovinei,\n" +
//                "sa cumpere 3 kg de mere. Pe drum, in apropiere de strada\n" +
//                "Bucovinei, s-a intalnit cu Marcela. Marcela mergea si ea \n" +
//                "la piata, asa ca " + author + " si Marcela s-au dus impreuna.\n" +
//                "" + author + " a cumparat 3 kg de mere. Marcela a cumparat niste legume.\n" +
//                "Din cele 3 kg de mere, " + author + " i-a dat lui Marcela 1 kg, iar restul\n" +
//                "de 2 kg i-a dus mamei lui.");
//
//        int x = 2;
//        x += x += x++ + ++x;
////        x?
//
//        x += x; // x = x + x;
//        System.out.println(x);
//        x += x; // x = x + x;
//        System.out.println(x);
//        x++; //  x = x + 1;
//        System.out.println(x);
//        ++x; //  x = x + 1;
//        System.out.println(x);
//
//
//
//
//        Calculator.Calculator calc = new Calculator.Calculator();
//
//        System.out.println(calc.sum(3, 3));
//
//        System.out.println("The sum is: " + (2 + 2));
//
////        Given a text input, if it is “FastTrack”,
////        then print “Learning text comparison”.
////        If not, print “Got to try some more”
//
//        String text = "FastTrack";
//        Calculator.LogicalOperations logicalOp = new Calculator.LogicalOperations();
//        System.out.println(logicalOp.verifyText(text));
//
//

        LogicalOperations op = new LogicalOperations();
        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter number: ");
//        op.printToHundred(scan.nextInt());

//        System.out.println(op.getAverageOfOddNumber(1,100));
//        System.out.println(op.getAverageOfOddNumber(1.0,100.0));
//
//

//        int[] array = op.getPopulatedArray(100);
//        op.printArray(array);

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

//        op.printList(myList);
//        System.out.println(myList);

        System.out.print("Enter number:");
        try {
            System.out.println(myList.get(scan.nextInt()));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Entered number is too high");
        } catch (InputMismatchException e){
            System.err.println("Please enter a valid number");
        }

    }


}
