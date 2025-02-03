package inherit;

abstract class abc{
    int data;
    abstract void print();
}






public class Main extends abc{
    public static void main(String[] args) {


    }

    @Override
    void print() {
        System.out.println("This is implimentation of abstracct mentod print");
    }
}
