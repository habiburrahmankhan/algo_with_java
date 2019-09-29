package lecture_13;

public class client {
    public static void main(String[] args) {
        engine e= new engine() {
            @Override
            public void handbrake() {

                System.out.println("handbrakes ");
            }
        };
        e.start();
        e.stop();
        e.accelerate();
        engine pe = new patrol_engine();
      //  pe.makenoise();
        pe.start();
        pe.accelerate();
        pe.handbrake();
        e.handbrake();
    }
}
