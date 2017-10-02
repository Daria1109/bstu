package ru.bstu.iitus.vt41.Perova;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public abstract class Person {
    protected int birthYear;

    /**
     *
     * Функция инициализации
     */
    public abstract void init(Scanner scanner);

    /**
     *
     * Получение возраста человека
     * @return возраст человека
     */
    public int getAge() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        int currentYear = calendar.get(1);
        return currentYear - this.birthYear;
    }


}
