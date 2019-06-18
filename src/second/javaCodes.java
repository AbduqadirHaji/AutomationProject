package second;

import java.util.Scanner;

public class javaCodes {

    public static void main(String[] args) {

        System.out.println( " Welcome to our web site !  \n Please inter user name " );

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        String  reverse = "";
        for(int i=name.length()-1; i >= 0; i--){
             reverse += name.charAt(i);

        }

        System.out.println( reverse );

    }
}
