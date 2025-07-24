import java.util.Scanner;
public class If_Else {
    public static void main(String []arg){
        Scanner SC = new Scanner(System.in);

        int age = SC.nextInt();

        if (age>18) {
            System.out.println("Is Adult");
        }
        else System.out.println("Is Not Adult");
    }
}
