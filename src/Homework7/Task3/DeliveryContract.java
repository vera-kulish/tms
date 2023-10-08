package Homework7.Task3;

//Контракт на поставку товаров
//Содержит поля:
//- Номер документа
//- Тип товаров
//- Количество товаров
//- Дата документа

import java.util.Date;

public class DeliveryContract extends Document{

    String productType;
    double productAmount;

    public DeliveryContract(double number, Date date, String productType, double productAmount) {
        this.number = number;
        this.date = date;
        this.productType = productType;
        this.productAmount = productAmount;
    }

    public DeliveryContract() {
        this.number = Math.random() * 100;
        this.date = new Date();
    }

    @Override
    public void displayInfo() {
        System.out.println("Document number: " + number);
        System.out.println("Document date: " + date);
        System.out.println("Product type: " + productType);
        System.out.println("Product amount: " + productAmount);
    }
}
