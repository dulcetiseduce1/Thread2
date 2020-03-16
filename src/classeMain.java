public class classeMain {
    public static void main(String[] args) {

        classeThread cos = new classeThread();
        cos.start();

        //nome del thread
        System.out.println("Output nome thread: " + Thread.currentThread().getName());

        //conta da 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("numero thread: " + i);

            //fine programma
        }
    }
}
