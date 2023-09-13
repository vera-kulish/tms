import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter age: ");
        age = Integer.valueOf(br.readLine());

        if (age > 18 && age < 70) {
            System.out.println("Can go in");
        }
        else {
            System.out.println("Can't go in");
        }

    }
}
