
 import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yohan Lopes Rodrigues - 118 110 773
 */

 
public class Joaninha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();

        int dobroX = X * 2;
        int triploX = X * 3;

        System.out.println("dobro: " + dobroX + ", " + "triplo: " + triploX);
    }
}
