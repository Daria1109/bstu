package ru.bstu.iitus.vt41.Perova;
import java.util.Scanner;

public class Schoolboy extends Person {
    private int classSchool;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schoolboy schoolboy = (Schoolboy) o;

        return classSchool == schoolboy.classSchool;
    }

    @Override
    public int hashCode() {
        return classSchool;
    }

    @Override
    public void init(Scanner scanner){
        System.out.print("Введите год рождения ");
        super.birthYear = scanner.nextInt();
        System.out.println("Введите класс обучения ");
        this.classSchool = scanner.nextInt();
        scanner.nextLine();

    }
    @Override
    public int getAge (){
        return  super.getAge();
    }

    @Override
    public String toString() {
        return "Школьник, класс обучения " + this.classSchool;
    }
}
