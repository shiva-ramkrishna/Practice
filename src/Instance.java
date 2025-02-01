
class Student{
    private int rollno;
    private String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}
}

// public private protected default

class TestStudent4{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
//        s1.name="Karan";
//        s1.rollno=111;
        s1.insertRecord(111,"Karan");
        s2.insertRecord(222,"Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }  }













class cat{
    String breed;
    int age;
    int legs;
    String colour;
    boolean isTail;

}








public class Instance {
}
