package ru.bstu.iitus.vt41.Perova;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {

        String[] person = {"ru.bstu.iitus.vt41.Perova.Student", "ru.bstu.iitus.vt41.Perova.Schoolboy",
                "ru.bstu.iitus.vt41.Perova.Teacher", "ru.bstu.iitus.vt41.Perova.Principal"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество товаров");
        int personNum = scanner.nextInt();

        Person[] array = new Person[personNum];

        try {
            int i = 0;
            while (i < personNum) {
                System.out.println("Выберите тип персоны: " +
                        "1- студент " +
                        "2-школьник " +
                        "3-преподаватель " +
                        "4-директор" );
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

        Person minAgePerson = null;
        int minAge = Integer.MAX_VALUE;
        for (Person pers :
                array) {
            if (pers.getAge() < minAge) {
                minAge = pers.getAge();
                minAgePerson= pers;
            }
        }

        System.out.println("Самый младший человек это: " + minAgePerson.toString() + " ему " + minAgePerson.getAge());
    }
}
