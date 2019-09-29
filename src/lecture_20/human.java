package lecture_20;

import java.util.Comparator;

public class human implements Comparator<human> ,Comparable<human> {
    String name ;
    int age ;
    public human( int age ,String name )
    {
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(human second) {
        return (this.age - second.age);
    }
    @Override
    public String toString()
    {
        return (age + " = " + name);
    }

    @Override
    public int compare(human o1, human o2) {
        return 0;
    }
}
