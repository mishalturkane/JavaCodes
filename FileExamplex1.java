package filehandling;

import java.io.File;

public class FileExamplex1 {
    public static void main(String[] args) {
        File myfile=new File("D:\\FileHandling\\New folder\\FileExample.java");

        if(myfile.exists())
        {
            System.out.println(myfile.getName()+" is present");
        }
        else{
            System.out.println("file not present:");
            System.exit(0);
        }
        if(myfile.exists())
        {
            System.out.println(myfile.getName()+"is a file");
            System.out.println("size of the file is "+myfile.length());
        }
        else{
            System.out.println(myfile.getName()+"is a directory");
        }
        if(myfile.canWrite())
        {
            System.out.println(myfile.getName()+" allows write");
        }
        else{
            System.out.println(myfile.getName()+" file does not allow to write");
        }

    }
}
