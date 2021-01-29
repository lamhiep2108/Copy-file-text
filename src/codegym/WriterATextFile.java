package codegym;

import java.io.*;

public class WriterATextFile {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("hello.txt");
            writer.write("hello!");
            writer.close();
            File infile=new File("hello.txt");
            FileReader reader=new FileReader(infile);
            BufferedReader bufferedReader=new BufferedReader(reader);
            String line =null;
            while ((line= String.valueOf(reader.read())) !=null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
