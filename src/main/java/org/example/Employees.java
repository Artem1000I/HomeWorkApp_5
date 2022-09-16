package org.example;

public class Employees {

    private String fullName;

    private String jobTitle;

    private String email;

    private String phone;

    private int mony;

    private int year;

    public Employees(String fullName) {this(fullName, "no data","no data","no data", 0, 0);
    }

    public Employees() {
        this("");
    }


    public Employees(String fullName, String jobTitle, String email, String phone, int mony, int year) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.mony = mony;
        this.year = year;
    }
    public void printInfo2(){
        System.out.println(String.format("Сотрудник: %s\n Должность: %s\n Почта: %s\n Телефон: %s\n Зарплата: %s\n Возраст: %s",
                fullName,jobTitle,email,phone,mony,year));
    }



    public int getAge() {
        return year;
    }


}

