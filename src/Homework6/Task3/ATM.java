package Homework6.Task3;

public class ATM {

    int d20;
    int d50;
    int d100;

    ATM(int d20, int d50, int d100) {
        this.d20 = d20;
        this.d50 = d50;
        this.d100 = d100;
    }

    void addCash(int d20, int d50, int d100) {
        this.d20 += d20;
        this.d50 += d50;
        this.d100 += d100;

        displayInfo();
    }

    void displayInfo() {
        System.out.println("amount left: " + this.d100 + " x 100 + " + this.d50 + " x 50 + " + this.d20 + " x 20");
    }

    boolean withdraw(int amount) {

        int num100 = 0;
        int num50 = 0;
        int num20 = 0;

        if (amount < 20 || amount % 10 != 0) {
            System.out.println("Impossible to withdraw $" + amount + ". Amount should be a multiple of 10, minimum $20");
            return false;
        }

        if (amount > d100 * 100 + d50 * 50 + d20 * 20) {
            System.out.println("Not enough cash in the ATM");
            return false;
        }


        while (amount > 0) {
            if (amount >= 100 && d100 >= num100 + 1 && (amount-100) % 100 != 10) { // if amount to withdraw is more than 100 and there's enough cash in the ATM and the next step doesn't leave 10
                num100 += 1;
                amount -= 100;
            } else if (amount >= 50 && d50 >= num50 + 1 && (amount-50) % 50 != 10) {
                num50 += 1;
                amount -= 50;
            } else if (amount >= 20 && d20 >= num20 + 1) {
                num20 += 1;
                amount -= 20;
            } else {
                System.out.println("Not enough cash in the ATM");
                return false;
            }

        }

        System.out.println(num100 + " x 100");
        System.out.println(num50 + " x 50");
        System.out.println(num20 + " x 20");

        d100 -= num100;
        d50 -= num50;
        d20 -= num20;

        displayInfo();

        return true;
    }
}
