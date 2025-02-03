package excep;

public class Math {

    public int divide(int a,int b) throws Exception {
        if (b==0)
        {
            throw new Exception("my Exception: Cant divide by 0");
        }
        return a/b;
    }
}
