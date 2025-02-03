package excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {

        Math m=new Math();
        try{
            m.divide(2,0);

            // db connection
            File f=new File("");
            Scanner sc=new  Scanner(f);
            sc.nextLine();
            int a=2/0;
        }
        catch (NullPointerException file)
        {
            System.out.println("File not found");
        }
        catch (ArithmeticException arithmetic)
        {
            System.out.println(arithmetic+"cant divide with 0");
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Exception block is running!!");
        }
        finally {
            System.out.println("Finnally block is running");
        }


    }
}
