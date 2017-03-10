import java.util.concurrent.Semaphore;

/**
 * Created by wangyanhui on 2017/3/10.
 */
public class AddDemo implements Runnable {

    Semaphore semaphore = new Semaphore(1,true);

    public static int i= 0;

    public static synchronized void increase() throws InterruptedException {
//        semaphore.acquire();
//        synchronized (this) {
            for (int j = 0; j < 10; j++) {
                i++;
                System.out.println(Thread.currentThread().getName() + "-s1: " + i);
            }
//        }
//        semaphore.release();
    }

    @Override
    public void run() {
        try {
            increase();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "-s2: " + i);

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new AddDemo());
        Thread t2 = new Thread(new AddDemo());
        t1.start();
        t2.start();
    }
}
