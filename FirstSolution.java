import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	int length = input.length();
	String firstPart = "";
	String secondPart = "";
	if (length % 2 == 0) {
	    firstPart = input.substring(0, length / 2 - 1);
	    secondPart = input.substring(length / 2 + 1, length );
        System.out.println(firstPart + secondPart);
    } else if (input.length() == 3) {
	    firstPart = input.substring(0, 1);
	    secondPart = input.substring(2, 3);
        System.out.println(firstPart + secondPart);
    } else {
	    firstPart = input.substring(0, (length / 2) + 1);
	    secondPart = input.substring((length / 2) + 2, length);
        System.out.println(firstPart + secondPart);
    }
    }
}
