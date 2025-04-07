package composite_pattern;

public class ClientApp {
    public static void main (String[] args) {
        Component leaf1_1 = new Leaf1();
        Component leaf1_2 = new Leaf1();
        Component leaf2_2 = new Leaf2();

        Component composite1 = new Composite();
        composite1.add(leaf1_1);
        composite1.add(leaf1_2);

        Component composite2 = new Composite();
        composite2.add(leaf2_2);
        composite1.add(composite2);

        composite1.doSomething("param for doing something");

    }

}
