// Abstract Class and Method in Java


// NOTE: Abstract is such a class, with the help of which other classes can be created. (Abstract sets a standard for
// implementing methods.)
abstract class Parent{
    public Parent(){
        System.out.println("I am parent class.");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Hello, I'm a child class and have a good day.");
    }
}

class Child2 extends Parent{
    @Override
    public void greet(){
        System.out.println("I am the second child of parent class.");
    }
}

public class Practice{
    public static void main(String[] args) {
        Parent p = new Child(); // We can give reference of the abstract class and can create object of the child class.
        p.greet();
//        Parent p = new Parent(); // We can't create objects of abstract classes.
        // But we can use the constructor of parent class.
        Child c = new Child();
        c.greet();

        Child2 c2 = new Child2();
        c2.greet();
    }
}