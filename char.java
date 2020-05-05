import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class charStream{
    static FileReader fin;
    static FileWriter fout;
    public static void main(String[] args) 
    throws IOException
    {
        try{
            fin = new FileReader(args[0]);
            fout = new FileWriter("Output.txt");
            int temp;
            while((temp = fin.read())!= -1) fout.write((char)temp);
        }
        catch(Exception FileNotFoundException){
            System.out.println("File Not Found!");
        }
        finally{
            if (fin != null) fin.close();
            if (fout != null) fout.close();
        }
    }
}