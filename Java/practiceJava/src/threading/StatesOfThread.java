package threading;

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("RUNNING");
    }
}

public class StatesOfThread{
    public static void main(String[] args) throws InterruptedException {
        MyThread starter = new MyThread();
        Thread t1 = new Thread(starter);

        System.out.println(t1.getState());
        Thread.sleep(100);
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}