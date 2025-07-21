public class Inheritance_Employee extends ClassAndObject_Person {
    public double salary;
   
    public Inheritance_Employee(String name , int age, double salary){
      this.name = name;
this.age = age;
this.salary = salary;      

    }
        public void showDetails() {
        display();
        System.out.println("Salary: " + salary);
    }
}
