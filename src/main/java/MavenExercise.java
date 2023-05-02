import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class MavenExercise {
    public static void main(String[] args) {

        //Create a new class with a main method that prompts the user for input and does the following (using the StringUtils class)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        //Tells whether or not what the user entered is a number
        System.out.println(StringUtils.isNumeric(input));
        //Flips the case of the string
        System.out.println(StringUtils.swapCase(input));
        //Reverses the string
        System.out.println(StringUtils.reverse(input));


        

    }
}
