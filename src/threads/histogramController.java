package threads;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

/**
 *
 * @author koperingnet
 */
public class histogramController {
 
    ArrayList<Byte> bits = new ArrayList<>();
    
    public ArrayList<Byte> dataForHistogram(ArrayList<Byte> bitArray) {
        for (Byte bit : bitArray) {
            bits.add(bit);
        }
        return bits;
    }
    
    public JFreeChart createHistogram() throws IOException {

        HistogramDataset dataset = new HistogramDataset();
        dataset.setType(HistogramType.FREQUENCY);

        double[] target = new double[bits.size()];
        for (int i = 0; i < bits.size(); i++) {
            target[i] = bits.get(i);
        }
        dataset.addSeries(1, target, 256);

        String plotTitle = "HISTOGRAM TABLICY BAJTÓW";
        String xAxis = "ILOŚĆ WYSTĄPIEŃ";
        String yAxis = "BAJTY";
        PlotOrientation orientation = PlotOrientation.VERTICAL;

        boolean show = true;
        boolean toolTips = true;
        boolean urls = true;
        JFreeChart chart = ChartFactory.createHistogram(plotTitle, xAxis, yAxis,
                dataset, orientation, show, toolTips, urls);

        chart.setBackgroundPaint(Color.white);

        int width = 800;
        int height = 600;
        ChartUtilities.saveChartAsPNG(new File("histogram.PNG"), chart, width, height);

        return chart;
    }
}
