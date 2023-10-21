package Homework10.Task1;

//На вход передать строку (будем считать, что это номер документа).
//Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.

import java.util.regex.Pattern;

public class Document {

    Document() {
    }

    public boolean validateFormat(String docNumber) {
        return Pattern.matches("[a-zA-z]{4}-\\d{3}-[a-zA-z]{4}-\\d{3}-[a-zA-z]\\d[a-zA-z]\\d", docNumber);
    }

    //- Вывести на экран в одну строку два первых блока по 4 цифры.
    public void showNumbers(String docNumber) {

        StringBuffer buffer = new StringBuffer(docNumber);

        char[] numbers1 = new char[3];
        char[] numbers2 = new char[3];
        buffer.getChars(5,8,numbers1, 0);
        buffer.getChars(14,17, numbers2, 0);
        System.out.println(String.valueOf(numbers1) + String.valueOf(numbers2));
    }

    //- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public void replaceLettersWithAsterisks(String docNumber) {

        StringBuffer buffer = new StringBuffer(docNumber);

        buffer.setCharAt(0,'*');
        buffer.setCharAt(1,'*');
        buffer.setCharAt(2,'*');
        buffer.setCharAt(9,'*');
        buffer.setCharAt(10,'*');
        buffer.setCharAt(11,'*');
        System.out.println(buffer);
    }

    //- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public void printLetterLowercase(String docNumber) {

        StringBuffer buffer = new StringBuffer(docNumber);

        System.out.println(buffer.substring(0,4).toLowerCase() + "/" +
                            buffer.substring(9,13).toLowerCase() + "/" +
                            buffer.substring(18,19).toLowerCase() + "/" +
                            buffer.substring(20,21).toLowerCase());
    }

    //- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    // (реализовать с помощью класса StringBuilder).
    public void printLettersUppercase(String docNumber) {

        StringBuilder builder = new StringBuilder(docNumber);

        System.out.println("Letters: " + builder.substring(0,4).toUpperCase() + "/" +
                                        builder.substring(9,13).toUpperCase() + "/" +
                                        builder.substring(18,19).toUpperCase() + "/" +
                                        builder.substring(20,21).toUpperCase());

    }

    //- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
    // (причем, abc и ABC считается одинаковой последовательностью).
    public void containsAbc(String docNumber) {

        String lowerCase = docNumber.toLowerCase();

        if(lowerCase.contains("abc"))
            System.out.println("String contains abc");
        else
            System.out.println("String doesn't contain abc");
    }

    //- Проверить начинается ли номер документа с последовательности 555.
    public void startsWith555(String docNumber) {

        if(docNumber.startsWith("555"))
            System.out.println("String starts with 555");
        else
            System.out.println("String doesn't start with 555");
    }

    //- Проверить заканчивается ли номер документа на последовательность 1a2b.
    public void endsWith1a2b(String docNumber) {

        if (docNumber.endsWith("1a2b"))
            System.out.println("String ends with 1a2b");
        else
            System.out.println("String doesn't end with 1a2b");
    }
}
