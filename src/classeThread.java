public class classeThread implements Runnable{
    public int[] primoDieci = new int[10];
    public int sommaPrimo=0;
    public classeThread(int[] primoDieci){
        this.primoDieci=primoDieci;
    }

    @Override
    public void run(){
        System.out.println((Thread.currentThread().getName()+": sommo gli ultimi cinque."));
        for( int i=0; i<primoDieci.length; i++ ) {
            sommaPrimo=sommaPrimo + primoDieci[i];

        }
        System.out.println("Totale primo array = "+sommaPrimo);
    }
}