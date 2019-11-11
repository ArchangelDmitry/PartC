package Tasks;

import java.util.Scanner;

public class Example {

    /**
     * This program finds the biggest row of the array of rows
     */
    public static void main(String[] args) {

        //init scanner
        Scanner scan = new Scanner(System.in);

        //enter number of rows
        System.out.println("Enter the number of rows: ");
        int numRows = Integer.parseInt(scan.nextLine());

        //init arrays for saving rows
        String[] arrayOfRows = new String[numRows];

        //enter and save rows
        for (int i = 0; i < numRows; i++) {
            System.out.println(String.format("Enter the row number %d: ", i + 1));
            String row = scan.nextLine();
            arrayOfRows[i] = row;
        }

        //init variables for saving row with max length
        int maxLength = arrayOfRows[0].length();
        String maxLengthRow = arrayOfRows[0];

        //cycle for finding row with max length
        for (int i = 0; i < numRows; i++) {
            if (maxLength < arrayOfRows[i].length()) {
                maxLength = arrayOfRows[i].length();
                maxLengthRow = arrayOfRows[i];
            }
        }

        //print row with max length
        System.out.println("The biggest row is: " + maxLengthRow);
    }

}