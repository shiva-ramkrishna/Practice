package file;

import java.io.File;
import java.io.FileWriter;

public class Demo {

    public static void main(String[] args)  {
        try {
            FileWriter  f=new FileWriter("src/file/test.txt",true);
//            f.write("this is test data!!\n");
            f.append("\nthis is test data!!");
            f.close();
            System.out.println("Done!!");

//            File f=new File("src/file/test.txt");
//            if(f.delete()) {
//                System.out.println("File is deleted!!");
//            }
//            else {
//                System.out.println("Already exist");
//            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
