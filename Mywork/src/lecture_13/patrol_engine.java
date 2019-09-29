package lecture_13;

public class patrol_engine extends engine {
    public void start()
    {
        System.out.println("I start as a petrol engine ");
    }

    @Override
    public void handbrake() {
        System.out.println("handbrake ");
    }

    public void makenoise()
    {
        System.out.println("hurr hurr ");
    }

}
