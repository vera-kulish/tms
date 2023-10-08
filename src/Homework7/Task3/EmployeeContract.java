package Homework7.Task3;

//Контракт с сотрудником
//Содержит поля:
//- Номер документа
//- Дата документа
//- Дата окончания контракта
//- Имя сотрудника

import java.util.Date;

public class EmployeeContract extends Document{

    Date endDate;
    String employeeName;

    public EmployeeContract(double number, Date date, Date endDate, String employeeName) {
        this.number = number;
        this.date = date;
        this.endDate = endDate;
        this.employeeName = employeeName;
    }

    public EmployeeContract() {
        this.number = Math.random() * 100;
        this.date = new Date();
    }

    @Override
    public void displayInfo() {
        System.out.println("Document number: " + number);
        System.out.println("Document date: " + date);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Contract end date: " + endDate);
    }
}
