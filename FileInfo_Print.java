import java.io.File;

public class FileInfo_Print {
    public static void main(String[] args) {
                File f= new File("C:\\Users\\sanika Kenjale\\Desktop\\Learn coding.txt");
                if(f.exists())
                {
                    System.out.println("file name:"+f.getName());//getname is a method is used to print file name
                    System.out.println("file location:"+f.getAbsolutePath());//getAbsolutepath is a method used to find a location of a file
                    System.out.println("file Writable:"+f.canWrite());//canWrite is method is knowns that is file is writable or not
                    System.out.println("file readable:"+f.canRead());//canRead is method is knowns that is file is readable or not
                    System.out.println("file size:"+f.length());//length method knows the size of a file
                    System.out.println("file delete :"+f.delete());//delete method can delete the file

                }
                else
                {
                    System.out.println("file does not exists");
                }

        
    }
    
}

//all this called method in try can give the result in the form of true or false
//size of file determined in byte and will counting byte space is also counted e.g sanika kenjale  :size is 13