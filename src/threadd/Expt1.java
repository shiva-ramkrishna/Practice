package threadd;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("print some value");
    }
}



public class Expt1 {
    public static void main(String[] args) {
//        System.out.println("Hello!!");
//        Thread t=Thread.currentThread();
//        System.out.println(t);
//        System.out.println(t.getPriority());
//        System.out.println(t.getName());
        MyThread t1=new MyThread();
        t1.start();
        System.out.println(t1);
        System.out.println(t1
                .getName());
        MyThread t2=new MyThread();
        t2.start();
        System.out.println(t2);
        System.out.println(t2.getName());


    }
}
