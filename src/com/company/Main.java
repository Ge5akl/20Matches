package com.company;

import java.util.Scanner;

public class Main {

    public static int matches = 20;
    public static int matche = 0;

    public static void main(String[] args) {

        while (matches > 1) {
            message();
            bot();
            message();
            player();
        }
    }

    public static void bot() {

        if (matches == 1) {
            System.out.println("Для бот осталась последняя спичка. Бот проиграл");
        }

        if (matche == 1) {
            System.out.println("Количество выбранных спичек компьтером = 3");
            matches = matches - 3;
        }
        if (matche == 2) {
            matches = matches - 2;
            System.out.println("Количество выбранных спичек компьтером = 2");
        }
        if (matche == 3) {
            matches = matches - 1;
            System.out.println("Количество выбранных спичек компьтером = 1");
        }
        if (matches == 20) {
            int resultOneStep = 19 % 4;
            System.out.println("Количество выбранных спичек компьтером =  " + resultOneStep);
            matches = matches - resultOneStep;
        }
    }

    public static void player() {
        if (matches == 1) {
            System.out.println("Для игрока осталась последняя спичка. Игрок проиграл");
            System.exit(0);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Ход игрока. Введите количество спичек = ");
        matche = input.nextInt();
        matches = matches - matche;
        if (matche > 3 || matche == 0 || matche < 0) {
            System.out.println("Неккоректное количество спичек");
            player();
        }
    }
    public static void message(){
        System.out.println("На столе осталось " + matches + " спичек");
    }
}

