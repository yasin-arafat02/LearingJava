import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int n = SC.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n ; i++){
            arr[i]=SC.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
