package lecture_20;

import java.util.Arrays;

public class client  {
    public static void main(String[] args) {

        human om = new human(19,"Om");
        human manish= new human(11,"Manish");
        human areeb = new human(18,"Areeb");
        human guru = new human(20,"Guru");

        human arr[ ] ={om,manish,areeb ,guru} ;

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
