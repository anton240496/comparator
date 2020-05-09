package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    // в этом классе сортируем массивы и списки
    // объектов с помощь. интерфейсов Comparable и Comparator
    public static void main(String[] args) {

        // создаем массив объектов
        List<Person> pers = new ArrayList<>();

        pers.add(new Person(1, "Andrew", "ogur", 10));
        pers.add(new Person(2, "Viktor", "ilinsky", 20));
        pers.add(new Person(3, "Lena", "pomidor", 5));
        pers.add(new Person(4, "Alex", "galkin", 50));
        pers.add(new Person(5, "Bol", "vasilev", 54));

        System.out.printf("Original list of person:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.NameComparator);
        System.out.printf("Соритровка по имени:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers,Person.SurnameComparator);
        System.out.printf("сортировка по фамилли:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers,Person.AgeComparator);
        System.out.printf("сортировка по годам%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

    }

}