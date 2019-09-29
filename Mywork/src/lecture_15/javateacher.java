package lecture_15;

public class javateacher implements teacher{


    @Override
    public void study() {
        System.out.println("I am a java Teacher ");
    }

    @Override
    public void teach() {
        System.out.println("I teach like a java teacher");
    }

    @Override
    public void dance() {
        System.out.println("i dance like like java ");
    }

}
