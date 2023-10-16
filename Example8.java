package Ir1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String week = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите номер дня в месяце");
        String data = in.nextLine();

        System.out.printf("День недели -  " + week + " Дата - " + data + " Название месяца " + month);

    }
}
