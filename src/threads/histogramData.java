/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author koperingnet
 */
public class histogramData extends Thread {

    ArrayList<Byte> bit = new ArrayList<>();
    XMLController xmlc = new XMLController();
    int start; 
    int end; 
    int howManyThread;
    byte[] values;
    long time;
    boolean realized = false;

    public histogramData(int start, int end) {
        this.start = start;
        this.end = end;
        System.out.println("Rozpoczęcie wątku od " + start + " do " + end);
    }
    
    
    /**
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
    
    @Override
    public void run() {
       
        byte[] b = new byte[end];
        new Random().nextBytes(b);
        
        for (int k = start; k<end; k++) {
            bit.add(b[k]);
        }
        
        
        System.out.println("Koniec wątku od " + start + " do " + end);
        try 
			{ sleep( (int)(1000) ); }
			catch ( InterruptedException e ) 
			{ e.printStackTrace(); }     

    }

    public ArrayList<Byte> getBits() {
        return this.tab();    
    }
    
    public long getTime() {
        return time;
    }
    
    
    
    
}
