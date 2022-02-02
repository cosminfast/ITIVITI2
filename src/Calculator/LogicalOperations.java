package Calculator;

import java.util.List;

public class LogicalOperations {

    public String verifyText(String text) {
        if (text.equals("FastTrack"))
            return "Learning text comparison";
        else
            return "Gotta try some more.";
    }


    public void printToHundred(int start) {
        for (int i = start; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public double getAverageOfOddNumber(int first, int last) {
        double sum = 0;
        int count = 0;
        int iterator = first;
        while (iterator <= last) {
            if (iterator % 2 != 0) {
                sum += iterator;
                count++;
            }
            iterator++;

        }
        System.out.println(sum);
        System.out.println(count);
        return sum / count;
    }

    public double getAverageOfOddNumber(double first, double last) {
        double sum = 0;
        if (first % 2 == 0)
            first++;
        if (last % 2 == 0)
            last--;
        double count = (last - first + 2) / 2;

        while (first <= last) {
            sum += first;
            first += 2;
        }

        return sum / count;
    }

    public int[] getPopulatedArray(int maxValue) {
        int[] myArray = new int[maxValue];
        for (int i = 0; i < maxValue; i++)
            myArray[i] = i + 1;
        return myArray;
    }

    public void printArray(int[] myArray) {
        for (int i : myArray)
            System.out.println(i);
    }

    public void printList(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--){
            System.out.println(myList.get(i));
        }
    }

}
