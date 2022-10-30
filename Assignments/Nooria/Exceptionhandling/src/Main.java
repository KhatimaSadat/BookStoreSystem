 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner obj=new Scanner(System.in);
            int num1 , num2;
            System.out.println("enter first number");
            num1 =obj.nextInt();
            System.out.println("enter second number");
            num2 = obj.nextInt();
            int result =num1 / num2;
            System.out.println(num1 + "/" + num2 +" = " + result);
        }catch ( ArithmeticException e){
            System.out.println("the second number should not be nonzero");

        }
        Employee obj = new Employee();
        obj.EmployeeName();

    }
}
class  Employee{
    public void EmployeeName() throws ArrayIndexOutOfBoundsException{
        String[] arr = {"Ali","Reza","Zia"};
        for (String i : arr){
            System.out.println(i);
        }
        System.out.println("enter an index to show the realatatd employee , notice the array lenght is 4");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if(input > arr.length - 1){
            throw  new ArrayIndexOutOfBoundsException("Array is out of bound");
        }else {
            System.out.println(arr[input]);
        }
    }

}