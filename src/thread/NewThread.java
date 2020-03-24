package thread;

public class NewThread implements Runnable {
    Thread t;

    public NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("create child thread " + t);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("method run");
        for (int i = 5; i > 0; i--) {
            System.out.println("Дочерний поток = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Child Thread interrupt");
            }
            System.out.println("child thread stop");
        }

    }
}

