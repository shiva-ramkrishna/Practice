class Employee{
    private int id;
    private String name;
    private float salary;
    public Employee() {
    }
    public Employee(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }

    public  int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
 class TestEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"ajeet",45000);
        Employee e2=new Employee(102,"irfan",25000);
        Employee e3=new Employee(103,"nakul",55000);
        Employee e4=new Employee();
        System.out.println(e4);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }  }



public class Instance2 {




}
