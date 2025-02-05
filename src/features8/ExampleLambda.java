package features8;

interface Test{

    public String  print(String s);

}
public class ExampleLambda {
    public static void main(String[] args) {
        Test test=(s) -> {
            return s;
        };
        System.out.println(test.print("string"));
    }

}
