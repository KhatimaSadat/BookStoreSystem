 public class Threading {
     public static void main(String[]args){
         int[] arr= {10,20,30,40,50};
         int[] arr2 = {1,2,3,4,5};
         Runable r2 = new Revers(arr2);
         Runable r1 = new sum(arr);
         Thread t1 = new Thread(r1);
         Thread t2 = new Thread(r2);
         t1.start();
         t2.start();
     }
}
    class  Reverse implements Runable{
    public Reverse(int[]arr){
        for (int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    }
    public  void run(){
    try{
        Thread.sleep(1000);
    }catch (Exception e){

    }
    }
    class Sum implements  Runable{
    public  Sum(int[]arr){
        int count =0;
        for( int i:arr){
            count+=i;
        }
        System.out.println("Total is : " + count);
    }
    public  void run(){
        try{ Thread.sleep(2000);
    }catch ( Exception e){
    }
    }
