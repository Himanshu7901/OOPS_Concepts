public class Main {
    public static void main(String[] args) {

        // Class and Object
        ClassAndObject_Person person = new ClassAndObject_Person();
        person.name = "Himanshu";
        person.age = 22;
        person.display();

        // Inheritance
        Inheritance_Employee emp = new Inheritance_Employee("Ravi", 28, 55000);
        emp.showDetails();

        // Encapsulation
        Encapsulation_BankAccount account = new Encapsulation_BankAccount();
        account.deposit(2000);
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());

        // Abstraction with abstract class
        AbstractionAbstractClass_Shape shape = new AbstractionAbstractClass_Circle();
        shape.draw();

        // Abstraction with interface
        AbstractionInterface_Vehicle vehicle = new AbstractionInterface_Car();
        vehicle.start();

        // Polymorphism - Overloading
        Polymorphism_Overloading_Calculator calc = new Polymorphism_Overloading_Calculator();
        System.out.println("Add Int: " + calc.add(2, 3));
        System.out.println("Add Double: " + calc.add(2.2, 3.8));

        // Polymorphism - Overriding
        Polymorphism_Overriding_Animal animal = new Polymorphism_Overriding_Animal();
        animal.sound();

        // Final keyword
        FinalKeyword_Demo finalDemo = new FinalKeyword_Demo();
        finalDemo.display();
        // Static keyword

        StaticKeyword_Demo.showCount();

        // Super keyword
        SuperKeyword_Demo superDemo = new SuperKeyword_Demo();
        superDemo.printNames();
    }
}
