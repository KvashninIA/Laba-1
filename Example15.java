package Ir1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число номер 1: ");
        int n1 = in.nextInt();

        System.out.println("Введите число номер 2: ");
        int n2 = in.nextInt();

        int n3 = n1 + n2;
        int n4 = n1 - n2;

        System.out.println("Решение 1: " + n3);
        System.out.println("Решение 2: " + n4);
        in.close();

    }
}
