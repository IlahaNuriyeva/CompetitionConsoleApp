package util;

import java.util.Scanner;

/**
 *
 * @author ilahe
 */
public class InputUtil {

    public static String requireText(String text) {
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static int requireNumber(String text) {
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }

    public static String requireName() {
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static String requireSurname() {
        System.out.println("Enter surname: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static String requireUsername() {
        System.out.println("Enter username: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static String requireEmail() {
        System.out.println("Enter email: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static int requireAge() {
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }

    public static String requirePassword() {
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

}
