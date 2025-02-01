package emp;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> lststd=new LinkedList<Student>();
        try {
            Scanner sc = new Scanner(new File("src/emp/data.csv"));
            sc.nextLine();
            while (sc.hasNext())
            {
                String []tmp=sc.nextLine().split(",");
                String name=tmp[0];
                String email=tmp[1];
                lststd.add(new Student(name,email));
            }

            for (Student tmp1:lststd)
            {
                System.out.println(tmp1);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
