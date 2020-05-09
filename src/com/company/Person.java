package com.company;
import java.util.Comparator;

public class Person implements Comparable<Person> {


    private int id;
    private String name;
    private String surname;
    private int age;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public int getAge() {
        return age;
    }


    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    @Override
    public int compareTo(Person emp) {

        return (this.id - emp.id);
    }

    public void printPerson() {
        System.out.printf("\t%d\t%s\t%s\t\t%s\t\t%n", id, name, surname, age);
    }

    public static Comparator<Person> NameComparator = new Comparator<Person>() {


        public int compare(Person e1, Person e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    public static Comparator<Person> SurnameComparator = new Comparator<Person>() {

        @Override
        public int compare(Person e1, Person e2) {
            return e1.getSurname().compareTo(e2.getSurname());
        }
    };
    public static Comparator<Person> AgeComparator = new Comparator<Person>() {

        @Override
        public int compare(Person e1, Person e2) {
            return e1.getAge() - e2.getAge();
        }
    };
}
