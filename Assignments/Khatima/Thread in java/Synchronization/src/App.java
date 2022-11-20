public class App {
    public static void main(String[] args) throws Exception {
        count c = new count();
        Thread t = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 3000; i++) {
                    c.increament();
                }
            }
        });
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 3000; i++) {
                    c.increament();
                }
            }
        });
        t1.start();
        t1.join();
        t.start();
        t.join();
        System.out.println(c.count);
    }
}
class count {
    int count = 0;
    public synchronized void increament() {
        count += 1;
    }
}