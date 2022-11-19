import java.util.*;
public class App {
    public static void main(String[] args)  {
        ArrayList<String> array = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to shopping cart");
        System.out.println("plz Enter the items to your cart");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter the name of item " + i);
            String item = input.next();
            array.add(item);
            
        }
        System.out.println(array);
        point:
        System.out.println("press 1 for adding item to your cart");
        System.out.println("press 2 for removing item from cart");
        System.out.println("press 3 for update any item ");
        System.out.println("press 4 for sorting item");
        int a= input.nextInt();

       switch (a) {
                case 1:   
                System.out.println("Enter the name of item " + (array.size()+1));
                String item = input.next();
                array.add(item);
                System.out.println(array);
                break ;
                case 2:
                System.out.println("Enter which item do you want to remove");
                String data =input.next();
                array.remove(array.indexOf(data));
                System.out.println("removed item");
                System.out.println(array);
                break;
                case 3:
                System.out.println("enter the item you want to update");
                String old = input.next();
                System.out.println("Enter the update one");
                String updat=input.next();
                array.set(array.indexOf(old), updat);
                System.out.println("updated item");
                System.out.println(array);
                break;
                case 4:
                System.out.println("Sorting acending order");
                Collections.sort(array);
                System.out.println(array);
                System.out.println("Sorting decending order");
                Collections.reverse(array);
                System.out.println(array);
                break;
                default:
                    break;
       }

        
    }
}
