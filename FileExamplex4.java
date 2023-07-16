package filehandling;

import java.io.File;
import java.util.Date;

// public boolean mkdri and mkdis
public class FileExamplex4 {
    public static void main(String[] args) {
       File newdir=new File("D:/mishal2/turkane2/basi2/love.txt");
        System.out.println(newdir.getName()+" exist "+newdir.exists());
        System.out.println(newdir.getName()+" Go to create "+newdir.mkdirs());
        System.out.println(newdir.getName()+" exist "+newdir.exists());

    }

}
