package ru.bstu.iitus.vt41.Perova;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static String[] person = {"ru.bstu.iitus.vt41.Perova.Student", "ru.bstu.iitus.vt41.Perova.Schoolboy",
            "ru.bstu.iitus.vt41.Perova.Teacher", "ru.bstu.iitus.vt41.Perova.Principal"};
    static Scanner scanner = new Scanner(System.in);
    static Person[] array;

    public static int enterNumberOfPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество персон");
        int personNum = scanner.nextInt();
        array = new Person[personNum];
        return personNum;
    }


    public static void entryArrayPerson(int personNum) {
        try {
            int i = 0;
            while (i < personNum) {
                System.out.println("Выберите тип персоны: " +
                        "1- студент " +
                        "2-школьник " +
                        "3-преподаватель " +
                        "4-директор");
                int type = scanner.nextInt();
                scanner.nextLine();
                if (type >= 1 && type <= 4) {
                    array[i] = (Person) Class.forName(person[type - 1]).newInstance(); // создается экземпляр класса
                    array[i].init(scanner);
                    i++;
                } else {
                    System.out.println("Вы допустили ошибку при вводе");
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        entryArrayPerson (enterNumberOfPerson());

        //сортируем массив объектов с помощью Comparator по возрасту
        Arrays.sort(array, new SortAgeCompare());
        //System.out.println("Сортировка по возрасту:\n"+Arrays.toString(array));
        System.out.println("Самый младший человек это: " + array[0].toString());
    }
}
