package threading;

class ThreadPractice extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("World");
        }
    }
}

public class Main{
    public static void main(String[] args){

        ThreadPractice thread = new ThreadPractice();
        thread.start();

        while(true) System.out.println("Hello");
    }
}
