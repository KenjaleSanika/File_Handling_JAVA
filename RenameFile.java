import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldfile=new File("C:\\Users\\sanika Kenjale\\Desktop\\LC.txt");
        File newfile=new File("C:\\Users\\sanika Kenjale\\Desktop\\file.txt");
    
    if(oldfile.exists())
    {
        System.out.println(oldfile.renameTo(newfile));

    }
    else
    {
        System.out.println("file dosen't exists....");
    }
    
}
}