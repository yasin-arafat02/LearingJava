public class AllLoop {
    public static void main(String[] args) {
        
        // For loop example: prints numbers from 1 to 5
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");  // print current value of i followed by space
        }
        System.out.println("\n");  // move to next line twice for clarity

        // While loop example: prints numbers from 1 to 5
        System.out.println("While loop:");
        int j = 1;  // initialize counter variable j to 1
        while (j <= 5) {  // loop continues while j is less than or equal to 5
            System.out.print(j + " ");  // print current value of j followed by space
            j++;  // increment j by 1 each iteration
        }
        System.out.println("\n");  // move to next line twice for clarity

        // Do-while loop example: prints numbers from 1 to 5
        System.out.println("Do-While loop:");
        int k = 1;  // initialize counter variable k to 1
        do {
            System.out.print(k + " ");  // print current value of k followed by space
            k++;  // increment k by 1
        } while (k <= 5);  // condition checked after executing the loop body
        System.out.println();  // move to next line
    }

}
