package org.example;

public class Main {
    public static void main(String[] args) {
        Employees[] employee = new Employees[6];
        employee[0] = new Employees ("Булкин Степан Сергеевич","Генеральный Директор","BULKA@mail.ru","+79119013221",150999,45);
        employee[1] = new Employees ("Хлеборезкин Виктор Николаевич","Директор","HLEB@mail.ru","89141111111",140998,41);
        employee[2] = new Employees ("Батонов Александр Александрович","Зам Директора","BUTON_AHU@mail.ru","89142222222",130997,46);
        employee[3] = new Employees ("Синабонов Король Артурович","Зам зама директора","SINBON@mail.com","89143333333",120996,42);
        employee[4] = new Employees ("Макавто Киевси Бургерович","Зам зам зама","MAK@mail.ru","8914444444",110995,69);
        employee[5] = new Employees("Артём");
        for (int i = 0; i < employee.length; i++) {
            if(employee[i].getAge() > 40){
                employee[i].printInfo2();
            }

        }

    }




}

