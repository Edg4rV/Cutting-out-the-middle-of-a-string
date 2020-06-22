import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = (sc.nextLine()).toCharArray();

        if (chars.length % 2 == 0) {
            for (int i = 0; i < chars.length / 2 - 1; i++) {
                System.out.print(chars[i]);
            }
            for (int i = chars.length / 2 + 1; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
        } else {
            for (int i = 0; i < (chars.length - 1) / 2; i++) {
                System.out.print(chars[i]);
            }
            for (int i = (chars.length - 1) / 2 + 1; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
        }
    }
}
