package challenge4.oop;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Club Registration Form ===");

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline

        System.out.print("Enter your student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter the club you want to join: ");
        String clubName = scanner.nextLine();

        System.out.println("\n=== Registration Successful ===");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Student ID : " + studentId);
        System.out.println("Club       : " + clubName);
    }
}
