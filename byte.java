import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteStream {
static FileInputStream fin;
static FileOutputStream fout;
public static void main(String[] args) 
throws IOException
{ int i;

    try{
        fin = new FileInputStream(args[0]);
        fout = new FileOutputStream("Output.txt");
        int temp;
        while((temp=fin.read()) != -1) fout.write((byte)temp);
        }
        catch(Exception fileNotFoundException)
        {
        System.out.println("File not Found!");
        }
        finally
        {
            if (fin != null) fin.close();
            if (fout != null) fout.close();
        }
}
}