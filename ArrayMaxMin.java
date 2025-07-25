import java.util.Scanner;
public class ArrayMaxMin {
    public static void main(String []arg){
        Scanner SC = new Scanner(System.in);

        int max = -10000;
        int min = 10000;

        int n = SC.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
