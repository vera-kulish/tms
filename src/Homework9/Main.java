package Homework9;

public class Main {

     public static void main(String[] args) {

         Registration registration = new Registration();
         try {
             registration.register("QWE", "RTY123 ", "RTY123");
         }
         catch (WrongLoginException | WrongPasswordException e) {
             System.out.println(e);
         }
     }
}
