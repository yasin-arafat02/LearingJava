import java.util.Scanner;
public class MarkSheet {
    public static void main(String []arg){
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = SC.nextLine();

        System.out.print("Enter Your marks : ");
        int mark = SC.nextInt();

        String grade;

        if (mark>=90){
            grade = "A+";
        }
        else if(mark>=80){
            grade = "A";
        }
        else if(mark>=70){
            grade = "A-";
        }
        else if(mark>=60){
            grade = "B";
        }
        else if(mark>=50){
            grade = "C";
        }
        else if(mark>=40){
            grade = "D";
        }
        else{
            grade = "F";
        }

        System.out.printf("Your Name is %s , Your Grade is %s\n",name,grade);
        SC.close();
    }
}
