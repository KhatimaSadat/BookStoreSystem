import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
try{
    Scanner a= new Scanner(System.in);
    int b , c;
   
   
    System.out.println("Enter numbers");
    b = a.nextInt();
    System.out.println("secound num");
    c= a.nextInt();
    int result = b/c;
    System.out.println("result");

}
catch(ArithmeticException e){
    System.out.println("this shouldn't be zero");
}
    
}
}


class student{
    public void studentName(){
        String[] arr = { "khatma", "andisheh","shaqayeq"};
        for(String i:arr){
            System.out.println(i);
        }
        System.out.println("enter it");
        Scanner s = new Scanner(System.in);
        int input s.nextInt();
        if(input > arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("array is out of bound");
        }
        else{
            System.out.println(arr[input]);
        }
    }
}