package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/*
 Container fot leaves and other composites.
 Have to implement some methods for working with leaves.
 */
public class Composite implements Component
{
    private List<Component> components = new ArrayList<Component>();

    @Override
    public void doSomething(String param) {
        for(Component component: this.components)
        {
            component.doSomething(param);
        }
    }
    public void add(Component component)
    {
        this.components.add(component);
    }

    public void remove(Component component){
        this.components.remove(component);
    }
}
