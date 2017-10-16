package ru.bstu.iitus.vt41.Perova;
import java.util.Scanner;

public class Teacher extends  Associate{
    private int numberSertif;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

       Teacher teacher= (Teacher) o;

        return numberSertif==teacher.numberSertif;
    }

    @Override
    public int hashCode() {
        return numberSertif;
    }

    @Override
    public void init(Scanner scanner){
        System.out.println("Введите год рождения");
        super.birthYear = scanner.nextInt();
        System.out.println("Введите номер сертификата");
        this.numberSertif = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public int getAge(){
        return  super.getAge();
    }

    @Override
    public  String toString() {
        return "Преподаватель с номером сертификата " + this.numberSertif + " ему, "+ getAge();
    }
}
