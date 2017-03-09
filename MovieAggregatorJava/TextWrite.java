package MovieAggregator;

import java.io.*;
import java.util.*;

public class TextWrite extends writer {
    public void write(Map<Integer, List<String>> data, String fileName) {
        String FileName = "Output.text";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(FileName))));
            bw.append("Movie Details");
            bw.newLine();
            bw.append(">>..");
            for(Integer i : data.keySet()) {
            	bw.newLine();
            	bw.append(">>..");
            	bw.append((i+1) +" : "+ data.get(i));
            }
            System.out.println("generated file location: " + FileName);
        } catch (IOException e) {
            System.out.println("exception occured into text file writing");
        } finally {
            if(bw != null) {
                try {
                    bw.flush();
                    bw.close();
                } catch (IOException e) {
                    System.out.println("IOExeption Occured");
                }
            }
        }
    }
}