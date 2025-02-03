package inherit;

interface testInterface
{
    final int a=20;
    void print();

}
public class Inter implements testInterface {
    @Override
    public void print() {
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        testInterface t=new Inter();
        t.print();
    }
}
