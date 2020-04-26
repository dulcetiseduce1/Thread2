
public class classeMain {
    public static void main(String[] args) {

        int[] primoArray = new int [5];
        for(int j=0; j<5; j++){
            primoArray[j]=(int)(Math.random()*100);
        }

        int[] secondoArray =new int[5];
        for(int j=0;j<5;j++){
            secondoArray[j]=(int)(Math.random()*100);
        }

        int[] terzoArray =new int[5];
        for(int j=0;j<5;j++){
            terzoArray[j]=(int)(Math.random()*100);
        }

        classeThread primo = new classeThread(primoArray);
        secondoThread secondo = new secondoThread(secondoArray);
        terzoThread terzo = new terzoThread(terzoArray);

        Thread uno = new Thread(primo);
        Thread due = new Thread(secondo);
        Thread tre = new Thread(terzo);

        uno.start();
        due.start();
        tre.start();

        try{
            uno.join();
            due.join();
            tre.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("La somma totale è = "+(primo.sommaPrimo+secondo.sommaSecondo+terzo.sommaTerzo));

    }
}
