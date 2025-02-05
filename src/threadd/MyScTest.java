package threadd;

class Test{

     void print(int n)
    {
        for (int i = 0; i <n ; i++) {
            System.out.println(n);
            try {
                Thread.sleep(400);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread
{
    Test t;
    MyThread1(Test t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(5);
    }
}

class MyThread2 extends Thread
{
    Test t;
    MyThread2(Test t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(50);
    }
}

public class MyScTest {
    public static void main(String[] args) {
        Test obj=new Test();
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
