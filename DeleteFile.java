import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f= new File("\\Users\\sanika Kenjale\\Desktop\\file.txt");
        if(f.delete())
        {
            System.out.println("File is deleted sucessfully"+f.getName());
        }
        else
        {
            System.out.println("failed to delete file");
        }
    }
    
}
