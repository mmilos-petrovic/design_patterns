package template_method_pattern;

public abstract class Template {

    // subclasses use this method
    public final void doMultiStageJob(){
        doJob1();
        doJob2();
        doJob3();
        doJob4();
    }

    private void doJob1(){
        System.out.println("JOB 1 implemented for everyone.");
    }
    protected void doJob2(){
        System.out.println("JOB 2 implemented but can be overreden.");
    }
    public abstract void doJob3();
    public abstract void doJob4();



}
