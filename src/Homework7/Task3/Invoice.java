package Homework7.Task3;

//Финансовая накладная
//Содержит поля:
//- Итоговая сумма за месяц
//- Дата документа
//- Номер документа
//- Код департамента

import java.util.Date;

public class Invoice extends Document{

    double totalSumMonth;
    String departmentCode;

    public Invoice(double number, Date date, double totalSumMonth, String departementCode) {
        this.number = number;
        this.date = date;
        this.totalSumMonth = totalSumMonth;
        this.departmentCode = departementCode;
    }

    public Invoice() {
        this.number = Math.random() * 100;
        this.date = new Date();
    }

    @Override
    public void displayInfo() {
        System.out.println("Document number: " + number);
        System.out.println("Document date: " + date);
        System.out.println("Total sum for the month: " + totalSumMonth);
        System.out.println("Department code: " + departmentCode);
    }
}
