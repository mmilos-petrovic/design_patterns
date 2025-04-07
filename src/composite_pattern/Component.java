package composite_pattern;

public interface Component {
    public void doSomething(String param);
    public void add(Component component);
    public void remove(Component component);
}
