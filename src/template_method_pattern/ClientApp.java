package template_method_pattern;

public class ClientApp {
    public static void main(String[] args) {
        Template templateExtension1 = new TemplateExtension1();
        templateExtension1.doMultiStageJob();
        System.out.println("===============");
        Template templateExtension2 = new TemplateExtension2();
        templateExtension2.doMultiStageJob();
    }
}
