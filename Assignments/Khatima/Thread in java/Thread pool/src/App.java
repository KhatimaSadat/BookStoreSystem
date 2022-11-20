import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws Exception {
        task w = new task("task1");
        task w2 = new task("task2");
        task w3 = new task("task3");
        task w4 = new task("task4");
        task w5 = new task("task5");

        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(w);
        ex.execute(w2);
        ex.execute(w3);
        ex.execute(w4);
        ex.execute(w5);
        ex.shutdown();
    }
}

class task implements Runnable {
    String name;

    public task(String n) {
        this.name = n;
    }

    public void run() {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(name + " thread part " + i);
                Thread.sleep(1000);
            }
            System.out.println(name + " thread completed");
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}