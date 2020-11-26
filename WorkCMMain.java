package oop.CoffeMaker;

import java.util.Scanner;

public class WorkCMMain {
    public static void main(String[] args) {

        CoffeMashine coffeMashine = new CoffeMashine();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1-americano;2-americano with milk;3-latte;4-capuchino;enter password if you admin;0-exit");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num == 0) {
                break;
            }
            switch (num) {
                case 1:
                    if (coffeMashine.checkAmericano()) {
                        coffeMashine.americano(money(17));
                    }
                    break;
                case 2:
                    if (coffeMashine.checkAmericano()) {
                        coffeMashine.americanoWithMilk(money(20));
                    }
                    break;
                case 3:
                    if (coffeMashine.checkLatte()) {
                        coffeMashine.latte(money(25));
                    }
                    break;
                case 4:
                    if (coffeMashine.checkCapuchino()) {
                        coffeMashine.capuchino(money(27));
                    }
                    break;
                case 66678:
                    enterAll(coffeMashine);
                    break;
            }
        }
    }

    public static int money(int priceCoffee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cost " + priceCoffee + "grn, put money. Attention machine doesn't give change");
        int count = scanner.nextInt();
        scanner.nextLine();
        while (count < priceCoffee) {
            System.out.println("enter " + (priceCoffee - count));
            count += scanner.nextInt();
            scanner.nextLine();
        }
        return count;
    }

    public static boolean password(int password) {
        if (password == 66678) {
            return true;
        } else {
            System.out.println("error, enter try password");
            return false;
        }
    }

    public static void enterAll(CoffeMashine coffeMashine) {
        System.out.println(coffeMashine.money());
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter coffee");
        int coffee = scanner.nextInt();
        System.out.println("enter water");
        int water = scanner.nextInt();
        System.out.println("enter milk");
        int milk = scanner.nextInt();
        scanner.nextLine();
        coffeMashine.putIn(coffee, water, milk);


    }


}
