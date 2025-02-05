package file;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Mainn {
    public static void main(String[] args) {
        StringBuffer b=new StringBuffer("this is data");
        b.append("!!");
        System.out.println(b.indexOf("data"));
        System.out.println(b);

        StringBuilder st=new StringBuilder("this is data");

    }
}
