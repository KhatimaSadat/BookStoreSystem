import java.lang.reflect.Method;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // try {
        // Scanner input = new Scanner(System.in);
        // int a, b;
        // System.out.println("Division");
        // System.out.println("Enter first number");
        // a = input.nextInt();
        // System.out.println("Enter second number");
        // b = input.nextInt();
        // int result = a / b;
        // System.out.println(a + " / " + b + " = " + result);
        // } catch (ArithmeticException e) {
        // System.out.println("Second number must be noneZero");
        // }
        Employee obj = new Employee();
        obj.EmployeeName();

    }

}

class Employee {
    public void EmployeeName() throws ArrayIndexOutOfBoundsException {
        String[] arr = { "Ahmad", "Khan ", "Jan", "Ali" };
        for (String i : arr) {
            System.out.println(i);
        }
        System.out.println("enter an index to show the related employee , notice the array lenght is 4");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if (input > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Array is out of bound");
        } else {
            System.out.println(arr[input]);
        }
    }

}