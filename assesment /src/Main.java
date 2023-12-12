import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total bill amount: ");
        int billTotal = scanner.nextInt();

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        scanner.close();

        if (numberOfPeople > 0) {
            double eachPersonPays = billTotal / numberOfPeople;

            System.out.println("Each person should pay: $" + eachPersonPays);
        } else {
            System.out.println("Invalid input. The number of people must be greater than 0.");
        }
    }
}