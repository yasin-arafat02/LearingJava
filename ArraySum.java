import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);

        int n = SC.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
