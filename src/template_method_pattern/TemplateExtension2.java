package template_method_pattern;

public class TemplateExtension2 extends Template{

    @Override
    public void doJob2() {
        System.out.println("TemplateExtension2 Override job2");
    }

    @Override
    public void doJob3() {
        System.out.println("TemplateExtension2 doing job3");
    }

    @Override
    public void doJob4() {
        System.out.println("TemplateExtension2 doing job4");
    }
}
