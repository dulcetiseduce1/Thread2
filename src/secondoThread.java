public class secondoThread implements Runnable{
    public int[] secondiDieci = new int[10];
    public int sommaSecondo=0;
    public secondoThread(int[] secondiDieci){
        this.secondiDieci=secondiDieci;
    }

    @Override
    public void run(){
        System.out.println((Thread.currentThread().getName()+": sommo gli ultimi cinque."));
        for( int i=0; i<secondiDieci.length; i++ ) {
            sommaSecondo=sommaSecondo + secondiDieci[i];

        }
        System.out.println("Totale secondo array = "+sommaSecondo);
    }
}
//fine