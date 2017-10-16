package ru.bstu.iitus.vt41.Perova;

import java.util.Scanner;

public class Associate extends  Person {
    private String job;

    @Override
    public  void init(Scanner scanner){
        System.out.println("Введите организацию ");
        this.job = scanner.nextLine();
    }


    @Override
    public String toString(){
        return "Сотрудник работающий в организации " + this.job;
    }
}
