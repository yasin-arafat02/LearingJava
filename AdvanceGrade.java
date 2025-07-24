import java.util.Scanner;
public class AdvanceGrade {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

         String grade;

        System.out.print("Enter Your Name : ");
        String name = SC.nextLine();

        System.out.print("Enter marks for Subject 1 : ");
        int mark1 = SC.nextInt();

        System.out.print("Enter marks for Subject 2 : ");
        int mark2 = SC.nextInt();

        System.out.print("Enter marks for Subject 3 : ");
        int mark3 = SC.nextInt();

        System.out.print("Enter marks for Subject 4 : ");
        int mark4 = SC.nextInt();

        System.out.print("Enter marks for Subject 5 : ");
        int mark5 = SC.nextInt();

        int total = mark1+mark2+mark3+mark4+mark5;
        double avg = total/5.0;

        if (avg>=90){
            grade = "A+";
        }
        else if(avg>=80){
            grade = "A";
        }
        else if(avg>=70){
            grade = "A-";
        }
        else if(avg>=60){
            grade = "B";
        }
        else if(avg>=50){
            grade = "C";
        }
        else if(avg>=40){
            grade = "D";
        }
        else{
            grade = "F";
        }

        System.out.println("\n--- Result ---");
        System.out.printf("Name : %s\n",name);
        System.out.printf("Total Mark : %d\n",total);
        System.out.printf("Avg : %.2f\n",avg);
        System.out.printf("Grade : %s\n",grade);
    }
}
