package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class PersonTest {

    @Test
    void test() {

        List<Person> pers = new ArrayList<>();

        pers.add(new Person(1, "Andrew", "ogurХХХХ", 1000));
        pers.add(new Person(2, "Viktor[]", "ilinsk!!!!???", 20000));
        pers.add(new Person(3, "Lena+MASHA", "pomid556or", 50000));
        pers.add(new Person(4, "Alex", "ga3454lkin", 4000));
        pers.add(new Person(5, "Bol", "vasi133lev", 540000));

        System.out.printf("Original list of person:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.NameComparator);
        System.out.printf("Соритровка по имени:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.SurnameComparator);
        System.out.printf("сортировка по фамилли:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.AgeComparator);
        System.out.printf("сортировка по годам%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);
    }

    @Test
    void test2() {
        int ageprson1 = 1000;
        int ageprson2 = 1000;
        int ageprson3 = -2000;
        int ageprson4 = 500;
        int ageprson5 = 10;



        List<Person> pers = new ArrayList<>();

        pers.add(new Person(1, "Andrew", "ogurХХХХ", ageprson1));
        pers.add(new Person(2, "Viktor[]", "ilinsk!!!!???", ageprson2));
        pers.add(new Person(3, "Lena+MASHA", "pomid556or", ageprson3));
        pers.add(new Person(4, "Alex", "ga3454lkin", ageprson4));
        pers.add(new Person(5, "Bol", "vasi133lev", ageprson5));

        System.out.printf("Original list of person:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.NameComparator);
        System.out.printf("Соритровка по имени:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.SurnameComparator);
        System.out.printf("сортировка по фамилли:%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.AgeComparator);
        System.out.printf("сортировка по годам%n%n\tid\tNam2e\tsurname\t    age\n");
        pers.forEach(Person::printPerson);
    }

    @Test
    void test3() {
        int ageprson1 = 1000;
        int ageprson2 = 1000;
        int ageprson3 = -2000;
        int ageprson4 = 500;
        int ageprson5 = 10;

        String nameperson = "123Alwx";
        String nameperson2 = "Alex";
        String nameperson3 = "!Misha";
        String nameperson4 = "Sacha";
        String nameperson5 = "edison";




        List<Person> pers = new ArrayList<>();

        pers.add(new Person(1, nameperson, "ogurХХХХ", ageprson1));
        pers.add(new Person(2, nameperson2, "ilinsk!!!!???", ageprson2));
        pers.add(new Person(3, nameperson3, "pomid556or", ageprson3));
        pers.add(new Person(4, nameperson4, "ga3454lkin", ageprson4));
        pers.add(new Person(5, nameperson5, "vasi133lev", ageprson5));

        System.out.printf("Original list of person:%n%n\tid\tName\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.NameComparator);
        System.out.printf("Соритровка по имени:%n%n\tid\tName\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.SurnameComparator);
        System.out.printf("сортировка по фамилли:%n%n\tid\tName\tsurname\t    age\n");
        pers.forEach(Person::printPerson);

        Collections.sort(pers, Person.AgeComparator);
        System.out.printf("сортировка по годам%n%n\tid\tName\tsurname\t    age\n");
        pers.forEach(Person::printPerson);
    }



}