public class App implements Runnable {
    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        Runnable r2 = new Reserve(arr2);
        Runnable r1 = new Sum(arr);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }

    public void run() {

    }
}

class Reserve implements Runnable {
    public Reserve(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    public void run() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}

class Sum implements Runnable {
    public Sum(int[] arr) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        System.out.println("Total is : " + count);

    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
