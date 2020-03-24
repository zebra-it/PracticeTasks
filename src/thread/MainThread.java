package thread;

public class MainThread {
    public static void main(String[] args) {
        new NewThread();
        for (int i = 5; i >5; i--) {
            System.out.println("Main Thread " + i );
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupt");

            }
            System.out.println("Main Thread stop");

        }
        }
}
