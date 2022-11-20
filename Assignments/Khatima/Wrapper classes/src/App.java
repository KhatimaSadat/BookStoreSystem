import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        // Auto boxing
        Integer a;
        int b = 12;
        // Autoboxing done automaticly
        a = b;
        System.out.println(a);
        // unboxing
        int[] arr = { 1, 2, 3, 4 };
        int sum = 0;
        for (Integer i : arr) {
            System.out.println(arr[i - 1]);
            sum += i;
        }
        System.out.println("Sum = " + sum);
        // BigDecimal class

    }
}
