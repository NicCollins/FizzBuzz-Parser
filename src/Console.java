import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCollins on 12/4/2014.
 */
public class Console {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("                   Fizz Buzz Variant Solver");
        System.out.println("================================================================");
        System.out.println("This application will solve any Fizz Buzz variant you can create");
        System.out.println();
        System.out.println("Please choose one of the following options:");
        System.out.println("1) Standard FizzBuzz");
        System.out.println("2) Isreali FizzBuzz Variant");
        System.out.println("3) Custom Variant");
        System.out.print("Selection: ");
        String choice = br.readLine();
    }
}
