/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author koperingnet
 */
public class XMLController {
    
    XStream xstream = new XStream(new DomDriver());
    ArrayList<Double> bits = new ArrayList<>();
    
    public void saveXML (Double bit, String xmlFileName) {
        
        xstream.alias("bit", Double.class);
        String toXML = xstream.toXML(bit);
         try {
            try (PrintWriter out = new PrintWriter(xmlFileName)) {
                out.println(toXML);
            }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

    }
    
    public ArrayList<Double> load(String xmlFileName) throws FileNotFoundException {
      
        bits = (ArrayList<Double>) xstream.fromXML(new FileReader(xmlFileName));
        
        return bits;  
    }
}
