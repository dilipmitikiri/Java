package programs;

public class MultiThreading extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        MultiThreading t = new MultiThreading();
        t.start();

    }
}
