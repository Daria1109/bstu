package ru.bstu.iitus.vt41.Perova;

import java.util.Scanner;

public class Student extends Person {
    private int numberStud;

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Student guest = (Student) o;
        return birthYear == guest.birthYear && numberStud == guest.numberStud;


    }


    @Override
    public int hashCode() {
        int result = 1;
        result = result * 31 + numberStud;
        return result;

    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите год рождения ");
        super.birthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите номер зачетной книжки ");
        this.numberStud = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return "Студент с номером зачетной книжки " + this.numberStud + " ему, " + getAge();
    }

}
