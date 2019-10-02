package hackerblock;

import java.util.Scanner;

public class minswap {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int min=0;
        int i=0;
        while(i<s.length()-2){
            if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2)){
                min++;
                i+=3;
            }
            else{
                i++;
            }
        }
        System.out.println(min);
    }
}
