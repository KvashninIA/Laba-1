package Ir1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n1  = in.nextInt();
        int n2  = n1 - 1;
        int n3 = n1 + 1;
        int n4 = n1 + n2 + n3 + n1 * n2 + n1 * n3 + n2 * n3;

        System.out.println("Номер 1: " + n1);
        System.out.println("Номер 2: " + n2);
        System.out.println("Номер 3: " + n3);
        System.out.println("Номер 4: " + n4);
        in.close();

    }
}
