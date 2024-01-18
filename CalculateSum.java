// Program that will calculate the sum of five user-entered numbers
import java.util.Scanner;

public class CalculateSum {

    static int counter = 0;
    static int sum = 0;

    public static void Sum() {
        
        Scanner input = new Scanner(System.in);

        if (counter < 5) {
            counter++;
            int number = input.nextInt();
            sum += number;
            Sum();
        }
        
    }

    public static void main(String[] args) {

        System.out.println("Please enter five numbers: ");
        Sum();
        System.out.println("\nThank You!\nThe sum is " + sum);

    }

}
