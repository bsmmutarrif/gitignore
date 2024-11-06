import java.util.Scanner;

public class GitIgnoreTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();


        String joinedString = str1 + str2;
        System.out.println("The joined string is: Result- " + joinedString);

        System.out.print("this is the result which is not perfect it is from branch");
        System.out.print("this is the result which is not perfect. second push");
        scanner.close();
    }
}
