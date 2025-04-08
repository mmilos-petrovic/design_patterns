package template_method_pattern;

public class TemplateExtension1 extends Template{

    @Override
    public void doJob3() {
        System.out.println("TemplateExtension1 doing job3");
    }

    @Override
    public void doJob4() {
        System.out.println("TemplateExtension1 doing job4");
    }
}
