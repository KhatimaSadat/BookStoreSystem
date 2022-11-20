public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr2 = { 1, 2, 3, 4, 5 };
        // Reserve r = new Reserve(arr2);
        // Sum s = new Sum(arr2);
        // Thread t = new Thread(r);
        // Thread t2 = new Thread(s);
        // t.start();
        // t.join();
        // t2.start();

    }
}

// class Reserve implements Runnable {
//     int[] arr;

//     public Reserve(int[] arr) {

//         this.arr = arr;
//     }

//     public void run() {
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.println(arr[i]);
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException ex) {
//                 System.out.println("exception happend in reverse");
//             }
//         }
//     }
// }
// class Sum implements Runnable {
//     int[] arr;

//     public Sum(int[] arr) {
//         this.arr = arr;

//     }
//     public void run() {
//         int count = 0;
//         for (int i : arr) {
//             count += i;
//             System.out.println("count: " + count);
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//                 // TODO: handle exception
//                 System.out.println("exception from sum ");
//             }
//         }
//         System.out.println("Total is : " + count);

//     }
// }