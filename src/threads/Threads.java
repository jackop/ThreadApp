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
            case 1:
                final long start1 = System.nanoTime();

                histogramData hd1_1 = new histogramData(1, 2000000);
                hc.dataForHistogram(hd1_1.getBits());

                // 1 watek
                Thread t1_1 = new Thread(hd1_1);

                t1_1.start();

                hc.createHistogram();
                final long end1 = System.nanoTime();

                System.out.println("Czas trwania operacji :" + ((end1 - start1) / 1000000) + " ms");
                break;
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
            case 8:
                
                final long start8 = System.nanoTime();
                histogramData hd8_1 = new histogramData(1, 500000);
                hc.dataForHistogram(hd8_1.getBits());

                histogramData hd8_2 = new histogramData(500001, 1000000);
                hc.dataForHistogram(hd8_2.getBits());
                
                histogramData hd8_3 = new histogramData(1000001, 1500000);
                hc.dataForHistogram(hd8_3.getBits());
                
                histogramData hd8_4 = new histogramData(1500001, 2000000);
                hc.dataForHistogram(hd8_4.getBits());
                
                histogramData hd8_5 = new histogramData(2000001, 2500000);
                hc.dataForHistogram(hd8_5.getBits());
                
                histogramData hd8_6 = new histogramData(2500001, 3000000);
                hc.dataForHistogram(hd8_6.getBits());
                
                histogramData hd8_7 = new histogramData(3000001, 3500000);
                hc.dataForHistogram(hd8_7.getBits());
                
                histogramData hd8_8 = new histogramData(3500001, 4000000);
                hc.dataForHistogram(hd8_8.getBits());
                // 2 watki
                Thread t8_1 = new Thread(hd8_1);
                Thread t8_2 = new Thread(hd8_2);
                Thread t8_3 = new Thread(hd8_3);
                Thread t8_4 = new Thread(hd8_4);
                Thread t8_5 = new Thread(hd8_5);
                Thread t8_6 = new Thread(hd8_6);
                Thread t8_7 = new Thread(hd8_7);
                Thread t8_8 = new Thread(hd8_8);

                t8_1.start();
                t8_2.start();
                t8_3.start();
                t8_4.start();
                t8_5.start();
                t8_6.start();
                t8_7.start();
                t8_8.start();

                hc.createHistogram();
                    final long end8 = System.nanoTime();

                System.out.println("Czas trwania operacji :" + ((end8 - start8) / 1000000) + " ms");
                
                break;
            case 10:
                
                final long start10 = System.nanoTime();
                histogramData hd10_1 = new histogramData(1, 400000);
                hc.dataForHistogram(hd10_1.getBits());

                histogramData hd10_2 = new histogramData(400001, 800000);
                hc.dataForHistogram(hd10_2.getBits());
                
                histogramData hd10_3 = new histogramData(800001, 1200000);
                hc.dataForHistogram(hd10_3.getBits());
                
                histogramData hd10_4 = new histogramData(1200001, 1600000);
                hc.dataForHistogram(hd10_4.getBits());
                
                histogramData hd10_5 = new histogramData(1600001, 2000000);
                hc.dataForHistogram(hd10_5.getBits());
                
                histogramData hd10_6 = new histogramData(2000001, 2400000);
                hc.dataForHistogram(hd10_6.getBits());
                
                histogramData hd10_7 = new histogramData(2400001, 2800000);
                hc.dataForHistogram(hd10_7.getBits());
                
                histogramData hd10_8 = new histogramData(2800001, 3200000);
                hc.dataForHistogram(hd10_8.getBits());
                
                histogramData hd10_9 = new histogramData(3200001, 3600000);
                hc.dataForHistogram(hd10_9.getBits());
                
                histogramData hd10_10 = new histogramData(3600001, 4000000);
                hc.dataForHistogram(hd10_10.getBits());
                // 2 watki
                Thread t10_1 = new Thread(hd10_1);
                Thread t10_2 = new Thread(hd10_2);
                Thread t10_3 = new Thread(hd10_3);
                Thread t10_4 = new Thread(hd10_4);
                Thread t10_5 = new Thread(hd10_5);
                Thread t10_6 = new Thread(hd10_6);
                Thread t10_7 = new Thread(hd10_7);
                Thread t10_8 = new Thread(hd10_8);
                Thread t10_9 = new Thread(hd10_9);
                Thread t10_10 = new Thread(hd10_10);

                t10_1.start();
                t10_2.start();
                t10_3.start();
                t10_4.start();
                t10_5.start();
                t10_6.start();
                t10_7.start();
                t10_8.start();
                t10_9.start();
                t10_10.start();

                hc.createHistogram();
                final long end10 = System.nanoTime();

                System.out.println("Czas trwania operacji :" + ((end10 - start10) / 1000000) + " ms");
                
                break;
            
            case 16:
                
                final long start16 = System.nanoTime();
                histogramData hd16_1 = new histogramData(1, 250000);
                hc.dataForHistogram(hd16_1.getBits());

                histogramData hd16_2 = new histogramData(250001, 500000);
                hc.dataForHistogram(hd16_2.getBits());
                
                histogramData hd16_3 = new histogramData(500001, 750000);
                hc.dataForHistogram(hd16_3.getBits());
                
                histogramData hd16_4 = new histogramData(750001, 1000000);
                hc.dataForHistogram(hd16_4.getBits());
                
                histogramData hd16_5 = new histogramData(1000001, 1250000);
                hc.dataForHistogram(hd16_5.getBits());
                
                histogramData hd16_6 = new histogramData(1250001, 1500000);
                hc.dataForHistogram(hd16_6.getBits());
                
                histogramData hd16_7 = new histogramData(1500001, 1750000);
                hc.dataForHistogram(hd16_7.getBits());
                
                histogramData hd16_8 = new histogramData(1750001, 2000000);
                hc.dataForHistogram(hd16_8.getBits());
                
                histogramData hd16_9 = new histogramData(2000001, 2250000);
                hc.dataForHistogram(hd16_9.getBits());
                
                histogramData hd16_10 = new histogramData(2250001, 2500000);
                hc.dataForHistogram(hd16_10.getBits());
                
                histogramData hd16_11 = new histogramData(2500001, 2750000);
                hc.dataForHistogram(hd16_11.getBits());
                
                histogramData hd16_12 = new histogramData(2750001, 3000000);
                hc.dataForHistogram(hd16_12.getBits());
                
                histogramData hd16_13 = new histogramData(3000001, 3250000);
                hc.dataForHistogram(hd16_13.getBits());
                
                histogramData hd16_14 = new histogramData(3250001, 3500000);
                hc.dataForHistogram(hd16_14.getBits());
                
                histogramData hd16_15 = new histogramData(3500001, 3750000);
                hc.dataForHistogram(hd16_15.getBits());
                
                histogramData hd16_16 = new histogramData(3750001, 4000000);
                hc.dataForHistogram(hd16_15.getBits());
                
                // 2 watki
                Thread t16_1 = new Thread(hd16_1);
                Thread t16_2 = new Thread(hd16_2);
                Thread t16_3 = new Thread(hd16_3);
                Thread t16_4 = new Thread(hd16_4);
                Thread t16_5 = new Thread(hd16_5);
                Thread t16_6 = new Thread(hd16_6);
                Thread t16_7 = new Thread(hd16_7);
                Thread t16_8 = new Thread(hd16_8);
                Thread t16_9 = new Thread(hd16_9);
                Thread t16_10 = new Thread(hd16_10);
                Thread t16_11 = new Thread(hd16_11);
                Thread t16_12 = new Thread(hd16_12);
                Thread t16_13 = new Thread(hd16_13);
                Thread t16_14 = new Thread(hd16_14);
                Thread t16_15 = new Thread(hd16_15);
                Thread t16_16 = new Thread(hd16_16);

                t16_1.start();
                t16_2.start();
                t16_3.start();
                t16_4.start();
                t16_5.start();
                t16_6.start();
                t16_7.start();
                t16_8.start();
                t16_9.start();
                t16_10.start();
                t16_11.start();
                t16_12.start();
                t16_13.start();
                t16_14.start();
                t16_15.start();
                t16_16.start();

                hc.createHistogram();
                final long end16 = System.nanoTime();

                System.out.println("Czas trwania operacji :" + ((end16 - start16) / 1000000) + " ms");
                
                break;
        }
        
           
    }
}
