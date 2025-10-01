class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500); // pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        try {
            t1.join();  // main waits until t1 completes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join();  // main waits until t2 completes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t3.start();
        // no join, so main will not wait for t3
    }
}