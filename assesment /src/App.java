import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + (2 * age) + " years old.");

        System.out.println("Your name has " + name.length() + " characters.");

        scanner.close();
    }
}