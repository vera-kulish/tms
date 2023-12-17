package Homework7.Task3;

//Создать систему для учета документов.
//Создать класс Регистр, который будет иметь методы:
//- сохранения документа в регистре
//- предоставление информации о документе

//- Класс регистр должен содержать внутри себя массив и при добавлении
//документа в регистр этот добавляемый документ должен добавляться в
//массив;
//- Массив для класса регистра должен быть размером 10;
//- Для полей "Дата документа" следует использовать тип данных Date;
//- В методе предоставления информации о документе следует выводить
//на экран информацию о переданном входным параметром документе;
//- Каждый класс для описания документов должен содержать конструктор
//с параметрами и без;

public class Register {

    Document[] documents = new Document[10];
    int countOfDocuments = 0;

    public Register() {}

    public void saveToTheRegister(Document document) {

        if(countOfDocuments >= 10) {
            System.out.println("You can't add more documents to the register");
            return;
        }
        documents[countOfDocuments] = document;
        countOfDocuments++;
    }

    public void displayInfo() {

        for (Document document : documents) {
            if (document != null) {
                document.displayInfo();
                System.out.println();
            }
        }
    }
}
