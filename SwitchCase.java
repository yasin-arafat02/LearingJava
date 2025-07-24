import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade (A, B, C, D, F): ");
        String grade = sc.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good job.");
                break;
            case "C":
                System.out.println("You can do better.");
                break;
            case "D":
                System.out.println("Work harder!");
                break;
            case "F":
                System.out.println("Failed. Don't give up!");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        sc.close();
    }

}
