package Ir1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свое имя: ");
        String name = in.nextLine();

        System.out.println("Введите свой год рождения: ");
        int year = in.nextInt();
        int age = 2023 - year;

        System.out.println("Имя " + name + " возраст " + age);
        in.close();
    }
}
