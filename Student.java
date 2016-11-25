package ru.kpfu;

public class Student {

    private int id, number;
    private String name, surname;
    private boolean budget;

    public Student(int id, int number, String name, String surname, boolean budget) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.budget = budget;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getNumber() {
        return String.valueOf(number);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String isBudget() {
        return String.valueOf(budget);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", budget=" + budget +
                '}';
    }
}
