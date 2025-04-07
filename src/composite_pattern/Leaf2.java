package composite_pattern;

public class Leaf2 implements Component{

    @Override
    public void doSomething(String param) {
        System.out.println("Leaf 2 is doing something with " + param);
    }

    @Override
    public void add(Component component) {

    }
    @Override
    public void remove(Component component) {

    }

}
