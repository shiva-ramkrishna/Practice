import org.w3c.dom.ls.LSOutput;

class Add<T>
{
    public T add(T a)
    {
        return a;
    }
}


public class Gener {
    public static void main(String[] args) {
        Add<String> a =new Add<String>();
        System.out.println(a.add("lkldgdgdaga"));
    }


}
