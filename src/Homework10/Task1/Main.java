package Homework10.Task1;

import Homework10.Task1.Document;

public class Main {

    public static void main(String[] args) {

        String docNumber = "WprF-248-eAbC-420-a1b2";
        System.out.println(docNumber);

        Document document = new Document();
        if(!document.validateFormat(docNumber)) {
            System.out.println("Incorrect format");
            return;
        }

        document.showNumbers(docNumber);
        document.replaceLettersWithAsterisks(docNumber);
        document.printLetterLowercase(docNumber);
        document.printLettersUppercase(docNumber);
        document.containsAbc(docNumber);
        document.startsWith555(docNumber);
        document.endsWith1a2b(docNumber);
    }
}
