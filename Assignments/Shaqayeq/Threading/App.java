public class App {
    public static void main(String[] args) throws Exception {
    int[] arr = {9,6,3};
    int[] arr1 = {18,33,12};
    Runnable run1 = new Reserve(arr1);
    Runnable run2 = new Reserve(arr);
    Thread th = new Thread(run1);
    Thread th1 = new Thread(run2);
    t.start();
    t1.start();
    }

   

    
}

class Reserve implements Runnable{
    public Reserve(int[] arr){
        for(int i= arr.length - 1; i>=0; i--);{
            System.out.println(arr[i]);
        }

    }
    
    public void run(){
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
    }
}
class Sum implements Runnable{
    public Sum(int[] arr){
        int count = 0;
        for(int i : arr){
            count += i;
        }
        System.out.println("total is"+ count);
    }
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){

        }
    }
}
