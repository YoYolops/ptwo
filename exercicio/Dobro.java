package exercicio;

import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();

        int dobroX = X * 2;
        int triploX = X * 3;

        System.out.println("dobro: " + dobroX + ", " + "triplo: " + triploX);
    }
}
