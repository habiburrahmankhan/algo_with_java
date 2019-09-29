package assignment5;

import java.util.Scanner;

public class replacehigherascii {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in) ;
            StringBuilder s = new StringBuilder( scan.nextLine()) ;

            replacechar(s) ;

        }
        public static void replacechar(StringBuilder s)
        {
            for (int i = 0; i <s.length() ; i++) {
                char ch =s.charAt(i) ;
                if (i%2==0)
                {
                    if (ch=='A' || ch=='Z')
                    {
                        ch =(char) (ch + 32) ;
                    }
                    else if (ch=='a' || ch=='z')
                    {
                        ch=(char) (ch-32) ;
                    }
                    else
                    {
                        ch=(char)(ch -1) ;
                    }
                }
                else
                {
                    if (ch=='A' || ch=='Z')
                    {
                        ch =(char) (ch + 32) ;
                    }
                    else if (ch=='a' || ch=='z')
                    {
                        ch=(char) (ch-32) ;
                    }
                    else
                    {
                        ch=(char)(ch +1) ;
                    }
                }

                s.setCharAt(i ,ch);
            }

            System.out.println(s.toString());
        }





}
