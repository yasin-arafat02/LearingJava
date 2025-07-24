public class TypeCasting {
    public static void main(String[] args) {
        int num = 10;
        double d = num;
        // automatically casts int to double
        System.out.println("Integer: " + num);
        System.out.println("Double: " + d);

        double d1 = 10.99;
        int num1 = (int) d; // manually casts double to int (loses data)

        System.out.println("Double: " + d1);
        System.out.println("Integer: " + num1);

    }
}
