import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[]args){
        File f= new File("C:\\Users\\sanika Kenjale\\Desktop\\Learn coding.txt");
        //handle the exception using try catch
        try
        {
            if(f.createNewFile())
        
            {
                System.out.println("file sucessfully created!!!!");
            }

            else
            {

                 System.out.println("file already exists!!!!");
            }

        }
        catch(IOException i)
        {
            System.out.println("Exception handled....!");
        }
        
    }
/* by pass the exception using throws
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\temp\\Learn coding.txt");

        if (f.createNewFile()) {
            System.out.println("File successfully created!!!!");
        } else {
            System.out.println("File already exists!!!!");
        }
    }
}
 */



    
}
//whenever we work with file or we perform a any operation with file then exception occur i.e ioexception  this exception we have to handle