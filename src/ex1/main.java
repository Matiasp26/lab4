package ex1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = myObj.nextLine();
        System.out.println("Middle is: " + middle(str) +"\n");
    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
