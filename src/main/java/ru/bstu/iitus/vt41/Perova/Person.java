package ru.bstu.iitus.vt41.Perova;

import java.util.Calendar;
import java.util.Scanner;


public abstract class Person {
    protected int birthYear;

    /**
     * Функция инициализации
     */
    public abstract void init(Scanner scanner);

    /**
     * Получение возраста человека
     *
     * @return возраст человека
     */
    public int getAge() {

        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;

    }


}
