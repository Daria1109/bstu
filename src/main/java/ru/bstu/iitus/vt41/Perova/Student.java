package ru.bstu.iitus.vt41.Perova;
import java.util.Scanner;

public class  Student  extends Person{
    private int numberStud;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return numberStud == student.numberStud;
    }

    @Override
    public int hashCode() {
        return numberStud;
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
        return "Студент с номером зачетной книжки " + this.numberStud;
    }

}
