package com.thestrikem;
import com.test.Console;

public class Main {
    String prefix;

    public Main(String prefix) {
        this.prefix = prefix;
    }

    public static void main(String[] args) {
        Human human = new Human("Генадий", 999);
        Console.log(human.getStatics());
    }
}

class Human {
    String name;
    int balance;
    private Car car;

    public Human(String name, int balance) {
        this.balance = balance;
        this.name = name;
        if (balance >= 100 || balance <= 1000) this.car = new Car("Жигуль");
        else if (balance >= 1000) this.car = new Car("Вип Жигуль");
    }

    String getStatics() {
        return "User: " + this.name + ", Balance: " + this.balance + "$" + ", Car: " + this.car.getModel();
    }
}
