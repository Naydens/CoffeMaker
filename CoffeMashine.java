package oop.CoffeMaker;

import java.util.Scanner;

public class CoffeMashine {
    int coffe;
    int milk;
    int water;
    String password;
    int money;

    CoffeMashine(int coffe, int milk, int water) {
        this.coffe = coffe;
        this.milk = milk;
        this.water = water;
    }

    CoffeMashine() {
    }

    public void state() {
        System.out.println("coffe " + this.coffe);
        System.out.println("milk " + this.milk);
        System.out.println("water " + this.water);
    }

    public void americano(int moneyUser) {
        minus(14,70,0,moneyUser,"Americano");
    }
    public void americanoWithMilk (int moneyUser){
       minus(14,70,50,moneyUser,"Americano with milk");
    }
    public void latte(int moneyUser){
        minus(14,70,150,moneyUser,"Latte");
    }
    public void capuchino(int moneyUser){
        minus(14,70,100,moneyUser,"Capuchino");
    }

    private boolean check(int howCoffe, int howWater, int howMilk) {
        if ((this.coffe - howCoffe) <= 0) {
            System.out.println("no coffe");
            return false;
        }
        if ((this.water - howWater) <= 0) {
            System.out.println("no water");
            return false;
        }
        if ((this.milk - howMilk) <= 0) {
            System.out.println("no milk");
            return false;
        } else {
            return true;
        }
    }
    private void minus(int coffe,int water,int milk,int money,String nameCoffe){
        if (check(coffe,water,milk)) {
            this.coffe -= coffe;
            this.water -= water;
            this.milk -= milk;
            System.out.println("take your "+nameCoffe);
        }
        this.money+=money;
    }
    public boolean checkAmericano(){
        return check(14,70,0);
    }
    public boolean checkAmericanoWithMilk(){
        return check(14,70,50);
    }
    public boolean checkLatte(){
        return check(14,70,150);
    }
    public boolean checkCapuchino(){
        return check(14,70,100);
    }
    public void putIn(int coffee,int water,int milk){
        this.coffe+=coffee;
        this.water+=water;
        this.milk+=milk;
    }
    public int money(){
        return this.money;
    }
}



