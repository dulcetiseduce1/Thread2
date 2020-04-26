public class terzoThread implements Runnable{
    public int[] terziDieci = new int[10];
    public int sommaTerzo=0;
    public terzoThread(int[] terziDieci){
        this.terziDieci=terziDieci;
    }

    @Override
    public void run(){
        System.out.println((Thread.currentThread().getName()+": sommo gli ultimi cinque."));
        for( int i=0; i<terziDieci.length; i++ ) {
            sommaTerzo=sommaTerzo + terziDieci[i];

        }
        System.out.println("Totale terzo array = "+sommaTerzo);
    }
}