import java.util.Scanner;
public class UserInput {
    public static void main(String[]arg){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = SC.nextInt();
        SC.nextLine();
        System.out.print("Enter your Name : ");
        String name = SC.nextLine();

        System.out.printf("Hello,I'm %s ! I'm %d years old",name,age);
        
    }
}
