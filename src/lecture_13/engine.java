package lecture_13;

public abstract class engine {
    public void start()
    {
        System.out.println("I start as a generic engine ");
    }
    public void stop()
    {
        System.out.println("I stop as a generic engine");
    }
    public void accelerate()
    {
        System.out.println("I accelerate  as a generic engine");
    }
    public abstract void handbrake();
}
