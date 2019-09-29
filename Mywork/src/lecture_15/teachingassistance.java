package lecture_15;

public class teachingassistance implements student ,teacher {

    @Override
    public void study() {
        System.out.println("i study more like a student");
    }

    @Override
    public void teach() {
        System.out.println("i teach more like a student");
    }

    @Override
    public void dance() {
        System.out.println("i dance more like a student");
    }

    @Override
    public void bunk() {
        System.out.println("i bunk more like a student");
    }
}
