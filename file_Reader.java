import java.io.FileReader;
import java.io.IOException;

public class file_Reader {
    public static void main(String[] args) {
        try
        {
            FileReader r=new FileReader("C:\\Users\\sanika Kenjale\\Desktop\\LC.txt");

            try
            {
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.print((char)i);//change the datatype of i (int to char)
                }

            }

            finally
            {
                r.close();
                System.out.println("File has closed!!!!!");
            }
        }

        catch(IOException e)
        {
            System.out.println("Exception handled sucessfully!!!!!");
        }
    }
    
}
