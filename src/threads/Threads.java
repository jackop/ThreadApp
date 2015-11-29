/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;


/**
 *
 * @author koperingnet
 */
public class Threads {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        int threads = 4;
        
        histogramController hc = new histogramController();
        
        switch (threads) {
            case 2:
                final long start = System.nanoTime();

                histogramData hd2_1 = new histogramData(1, 2000000);
                hc.dataForHistogram(hd2_1.getBits());

                histogramData hd2_2 = new histogramData(2000001, 4000000);
                hc.dataForHistogram(hd2_2.getBits());
                // 2 watki
                Thread t2_1 = new Thread(hd2_1);
                Thread t2_2 = new Thread(hd2_2);

                t2_1.start();
                t2_2.start();

                hc.createHistogram();
                final long end = System.nanoTime();

                System.out.println("Czas trwania operacji :" + ((end - start) / 1000000) + " ms");
                break;
                
            case 4:
                
                final long start4 = System.nanoTime();
                histogramData hd4_1 = new histogramData(1, 1000000);
                hc.dataForHistogram(hd4_1.getBits());

                histogramData hd4_2 = new histogramData(1000001, 2000000);
                hc.dataForHistogram(hd4_2.getBits());
                
                histogramData hd4_3 = new histogramData(2000001, 3000000);
                hc.dataForHistogram(hd4_3.getBits());
                
                histogramData hd4_4 = new histogramData(3000001, 4000000);
                hc.dataForHistogram(hd4_4.getBits());
                // 2 watki
                Thread t4_1 = new Thread(hd4_1);
                Thread t4_2 = new Thread(hd4_2);
                Thread t4_3 = new Thread(hd4_3);
                Thread t4_4 = new Thread(hd4_4);

                t4_1.start();
                t4_2.start();
                t4_3.start();
                t4_4.start();

                hc.createHistogram();
                final long end4 = System.nanoTime();

                System.out.println("Czas trwania operacji :" + ((end4 - start4) / 1000000) + " ms");
                
                break;
        }
        
           
    }
}
