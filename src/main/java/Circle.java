public class Circle extends Shape {

    public Circle(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("My name is " + getName() + " " + getClass());


    }
}
