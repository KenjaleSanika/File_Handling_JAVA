import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {

        try
        {
            FileWriter f= new FileWriter("C:\\Users\\sanika Kenjale\\Desktop\\LC.txt");
            try
            {
                f.write("Java Programming is the best language");   

            }
            finally
            {
                f.close();
            }
            System.out.println("sucessfully  data wrote in file");

        }

        catch(IOException i)
        {
            System.out.println(i);//i print which exception ocuur 

        }
        
    }
    
}
//in the second try block write operation has perform
//security related and closing realted code is put in finally block

//there are many class in java to write in file 1)BufferedWriter,2)FileOutputStream,3)PrintWriter