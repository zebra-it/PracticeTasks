package thread;

public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("t = " + t);
        t.setName("My Thread");
        System.out.println("после изменения имения = " + t);
        for (int i = 5; i > 0; i--) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
