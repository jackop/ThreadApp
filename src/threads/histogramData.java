package threads;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * @author Jacek Koprowski <183556>, Cyprian Szczygieł <183604>
 */

public class histogramData extends Thread {

    // PARAMETERS:
    //--------------------------------------------
    ArrayList<Byte> bit = new ArrayList<>();
    XMLController xmlc = new XMLController();
    private final Lock queue = new ReentrantLock();
     
    int start; 
    int end; 
    int howManyThread;
    byte[] values;
    long time;
    boolean realized = false;

    /**
     * Contructor.
     * 
     * @param start
     * @param end 
     */
    public histogramData(int start, int end) {
        this.start = start;
        this.end = end;
        System.out.println("Rozpoczęcie wątku od " + start + " do " + end);
    }
    
    /**
     * Tabela bitów.
     * 
     * @return 
     */
    public ArrayList<Byte> tab()  {
    byte[] b = new byte[4000000];
        new Random().nextBytes(b);
        for (int k = start; k<end; k++) {
            bit.add(b[k]++);
        }        
        return bit;
}
    
    /**
     * Obliczanie wartości do stworzenia histogramu.
     */
    
    @Override
    public void run() {
       
        byte[] b = new byte[end];
        new Random().nextBytes(b);
        queue.lock();
        for (int k = start; k<end; k++) {
            bit.add(b[k]);
        }
        queue.unlock();
        
        System.out.println("Koniec wątku od " + start + " do " + end);
        try {
            sleep((int) (1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * Pobieranie tablicy bajtów.
     * 
     * @return 
     */
    public ArrayList<Byte> getBits() {
        return this.tab();    
    }
    
}
