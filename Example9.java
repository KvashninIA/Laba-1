package Ir1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите дату: ");
        int data = in.nextInt();

        System.out.printf("Месяц " + month + " содержит " + data +" дней. ");
    }
}
