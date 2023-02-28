import java.io.File;
import java.io.FileFilter;

public class Main
{
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0 ; i < 3 ; i++) {
                System.out.println("Hello from Thread [" + Thread.currentThread().getName() + "]");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}