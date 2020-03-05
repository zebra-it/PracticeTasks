package thread;

public class NewThread implements Runnable {
    @Override
    public void run() {
        System.out.println("New Thread");
    }
}
