package threadd;
class  MyClass implements Runnable {

    @Override
    public void run() {
        System.out.println("your business logic!!");
    }
}


public class Expt2 {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        Thread t1=new Thread(obj);
        t1.start();
        System.out.println(t1);

        System.out.println(t1.getPriority());
        MyClass obj1=new MyClass();
        Thread t2=new Thread(obj1);
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2);
        System.out.println(t2.getName());
    }


}
