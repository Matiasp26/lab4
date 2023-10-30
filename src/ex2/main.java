package ex2;

/*import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter int: ");
        String str = myObj.nextLine();
        System.out.println("Middle is: " + middle(str) +"\n");
    }
}*/

import java.util.Scanner;

public class main {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in);
        int number;
        int sum = 0;
        System.out.print("Enter a number:  ");
        number = input.nextInt();
        String str = Integer.toString(number);
        for(int i = 0; i < str.length(); i++){
            sum += number%10;
            number /=10;
        }
        System.out.println("\nThe sum of the digits of " + number + " is " + sum);
    }
}
