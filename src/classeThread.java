
public class classeThread extends Thread {
    public void run() {

        //nome thread
        setName("classeThread");
        System.out.println("Output nome thread: " + Thread.currentThread().getName());

        //counter da 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("numero thread: " + i);

        }
    }
}
