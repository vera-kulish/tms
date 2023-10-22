package Homework11;

public class Main {

    public static void main(String[] args) {

        CustomArrayList cal = new CustomArrayList("1", "22", "333", "4444", "5", "66", "777", "888");
        CustomArrayList cal2 = new CustomArrayList(3);
        CustomArrayList cal3 = new CustomArrayList();

        cal.add("9999");
        for(int i = 0; i < cal.length(); i++)
            System.out.print(cal.get(i) + " ");
        System.out.println();

        cal.remove("5");
        for(int i = 0; i < cal.length(); i++)
            System.out.print(cal.get(i) + " ");
        System.out.println();

        cal.remove(7);
        for(int i = 0; i < cal.length(); i++)
            System.out.print(cal.get(i) + " ");
        System.out.println();

        System.out.println(cal.contains("5"));

        cal.clear();
    }
}
