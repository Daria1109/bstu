package ru.bstu.iitus.vt41.Perova;
import java.util.Scanner;

public class Principal extends  Associate {
    private int yerOfDestination;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Principal principal = (Principal) o;

        return yerOfDestination == principal.yerOfDestination;
    }

    @Override
    public int hashCode() {
        return yerOfDestination;
    }

    @Override
    public  void init(Scanner scanner){
        System.out.println("Введите год рождения ");
        super.birthYear = scanner.nextInt();
        System.out.println("Введите год назначения ");
        this.yerOfDestination = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public int getAge(){
        return super.getAge();
    }

    @Override
    public String toString(){
        return "Директор, год назначения " + this.yerOfDestination;
    }
}
