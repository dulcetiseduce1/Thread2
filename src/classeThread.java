public class classeThread extends Thread {
    public void run() {

        //nome del thread
        setName("classeThread");
        System.out.println("Output nome thread: " + Thread.currentThread().getName());

        //conta da 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("numero thread: " + i);
        }
    }

}
